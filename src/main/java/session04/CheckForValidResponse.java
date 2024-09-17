package session04;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class CheckForValidResponse {
	
	@Test
	public void GetSingleUser() {
		//specify base URI
		baseURI="https://reqres.in/api/users/2";
		
		//Get RequestSpecification of the request
		RequestSpecification requestSpec= given();
		
		//call get method
		Response rs=requestSpec.get();
		
		ValidatableResponse validateRes =rs.then();
		
		//status code
		validateRes.statusCode(200);
		System.out.println("second validation");
		
		//statusLine
		validateRes.statusLine("HTTP/1.1 200 OK");
	}
	@Test
	public void GetSingleUser_BBBStyle()
	{
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
          System.out.println("hi");
		
	}
}
