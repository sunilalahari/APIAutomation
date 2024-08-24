package StepDefinitions;

import static io.restassured.RestAssured.given;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJOs.AddPlace;
import POJOs.Employee;
import POJOs.EmployerDetails;
import Resources.APIResources;
import Resources.AddAddr;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddAddressAPI extends Utils {

	AddAddr addaddress;
	public AddPlace place;
	public RequestSpecification reqSpec, req, req1;
	Response response;
	String strResp;
	static String placeID;

	@Given("Add Place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
		addaddress = new AddAddr();
		place = addaddress.addr(name, language, address);
		reqSpec = requestSpec();
		req = given().spec(reqSpec).body(place);

	}

	@When("user calls {string} with {string} https request")
	public void user_calls_with_https_request(String resource, String httpMethod) throws IOException {
		APIResources apiRes;
		apiRes = APIResources.valueOf(resource);
		switch (httpMethod) {
		case "Post":
			response = req.when().post(apiRes.getResources());
			strResp = response.then().assertThat().statusCode(200).extract().asString();
			// System.out.println(strResp);
			break;
		case "Delete":
			response = req.when().delete(apiRes.getResources());
			strResp = response.then().assertThat().statusCode(200).extract().asString();
			// System.out.println(strResp);
		case "Get":
			System.out.println("Get Request is being executed: " + apiRes.getResources() + " placeid is: " + placeID);

			// System.out.println("Get Request is being executed: "+ apiRes.getResources());
			String ss = given().spec(requestSpec()).queryParam("place_id", placeID).log().all().when()
					.get(apiRes.getResources()).then().extract().asString();
			// System.out.println(ss);
		default:
			break;
		}

	}

	@Then("{string} of the response is {string}")
	public void of_the_response_is(String key, String value)
			throws StreamReadException, DatabindException, IOException {

		/*
		 * JsonPath path = new JsonPath(strResp); assertEquals(path.getString(key),
		 * value); placeID = path.getString("place_id");
		 * System.out.println("PlaceID is: " + placeID); String userDir =
		 * System.getProperty("user.dir"); System.out.println(userDir);
		 */
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			// System.out.println("The Loc of Json is: "+
			// System.getProperty("user.dir")+"\\Emplooyee.json");
			EmployerDetails details = mapper.readValue(
					new File(System.getProperty("user.dir") + "/employerDetails.json"), EmployerDetails.class);
			List<String> banks = Arrays.asList("SBI", "SBI1", "SUI2");
			details.setSupportedSalaryBanks(banks);
			System.out.println(details.getCompanyCEO());
			System.out.println(details.getEmployee());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Given("Get Place API preperation")
	public void get_place_api_preperation() throws IOException {

		// File f = new File(System.getProperty("user.dir") + "/Test.json");
		// List<POJOs.Address> la = new ArrayList<POJOs.Address>();
		// la.add(new POJOs.Address("Samatha Nagar", 56676));
		// la.add(new POJOs.Address("Maruthi Nagar, 3rd Line", 56676));

		// Employee e = new Employee("Anil", "ITS", 3323243, 355, la);
		// mapper.writeValue(f, e);
		// System.out.println("Helloooo");
	}

}
