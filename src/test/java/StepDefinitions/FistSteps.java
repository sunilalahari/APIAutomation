package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


import POJOs.AddPlace;
import POJOs.location;
import Resources.AddAddr;
import Utils.Utils;
import io.restassured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FistSteps extends Utils{

	RequestSpecification reqSpec;
	RequestSpecification res;
	AddPlace a;
	Response response;
	AddAddr addAdr;

	@Given("Api Json body with {string} {string} {string}")
	public void api_json_body_with(String name, String language, String address) {
	addAdr= new AddAddr();
		a= addAdr.addr(name, language, address);
	}

	@When("hit Post API with the body")
	public void hit_post_api_with_the_body() throws IOException {
		reqSpec= requestSpec();
		res = given().spec(reqSpec).body(a);

	}

	@When("prepare Post data")
	public void prepare_post_data() {
		response = res.when().post("/maps/api/place/add/json").then().log().all().extract().response();

	}

	@Then("Validate the resonse body status code is {string}")
	public void validate_the_resonse_body_status_code_is(String string) {
		String code = Integer.toString(response.statusCode());
		assertEquals(code, string);

	}

	@Then("{string} of the resposnse is {string}")
	public void of_the_resposnse_is(String keyValue, String expectedResult) {
		String re = response.asString();
		// System.out.println(response.toString());
		JsonPath json = new JsonPath(re);
		assertEquals(json.getString(keyValue).toString(), expectedResult);
		String placeId=json.getString("place_id");
		System.out.println(placeId);
	    char[] ch= placeId.toCharArray();
	    for(char ch1: ch) {
	    	if(Character.isDigit(ch1)) {
	    		
	    	}
	    }

	}

}
