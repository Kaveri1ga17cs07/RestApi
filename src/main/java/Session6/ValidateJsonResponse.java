package Session6;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ValidateJsonResponse {
	
	@Test
	public void UserListResponseBody() {
		
		//Get RequestSpecification Reference
		RequestSpecification requestSpec=RestAssured.given();
		
		//specify base URI
		requestSpec.baseUri("https://reqres.in/");
		requestSpec.basePath("/api/users?page=2");
		
		//create /perform get request
		Response response=requestSpec.get();
//		
		//read response body
		ResponseBody responseBody=response.getBody();
		
		String responseString= responseBody.asString();
		System.out.println("Response body:" + responseString);
		
//		//check for presense of george in response body
		Assert.assertEquals("check for presense of george in response body",true,responseString.contains("George") );
//	
	//get json path view of response body
		JsonPath jsonPathView=responseBody.jsonPath();
		
		//x.data[4].first_name
		String firstName=jsonPathView.get("data[0].first_name");
		Assert.assertEquals(firstName,"George");
	
	
	
	
	}
	
	

}
