package RestApi.RestAssured;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import junit.framework.Assert;
import org.testng.Assert;

public class Test_Getmethod {
	
	@Test
	public void Get() {
		
		Response rs = get("https://reqres.in/api/unknown");
		System.out.println("Response code:" + rs.getStatusCode());
		System.out.println("Response body:" + rs.getBody().asString());
		System.out.println("Response Time:" + rs.getTime());
		System.out.println("Response Header:" + rs.getHeader("Content-Type"));
		
		
		//validate status code=200
	//	expected status code =201
		int expectedStatusCode=200;
		int ActualStatusCode=rs.getStatusCode();
		
		Assert.assertEquals(expectedStatusCode, ActualStatusCode);
		
	}
	
	//if you want to remove RestAssured  class from demo and test01 u need to add * and static in import  
	@Test
	public void test01() {
		//given ,when,then
		baseURI="https://reqres.in/api/unknown";
		given()
		.queryParam("page", "6")
		.when().get()
		.then().statusCode(200);
		
	}

}
