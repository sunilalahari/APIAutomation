package Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {
	public static RequestSpecification reqSpec;
	
	public RequestSpecification requestSpec() throws IOException {
		
		if(reqSpec==null) {
		PrintStream print = new PrintStream(new FileOutputStream("logging.txt"));
		reqSpec = new RequestSpecBuilder().setBaseUri(getProprtyValue("baseURL"))
				.addQueryParam("key", "qaclick123").
				addFilter(RequestLoggingFilter.logRequestTo(print)).
				addFilter(ResponseLoggingFilter.logResponseTo(print)).setContentType(ContentType.JSON).build();
		
		
		return reqSpec;
		}
		return reqSpec;
		
	}
	
	public static String getProprtyValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Alahari Sunil\\eclipse-workspace\\APIAutomation\\src\\test\\java\\Resources\\Prop.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
	}

}
