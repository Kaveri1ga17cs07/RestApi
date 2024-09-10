package session05;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseHeader {
	
	@Test
	public void GetSingleUser() {
	
		//specify base URI
		baseURI="https://reqres.in/api/users/2";
				
		//Get RequestSpecification of the request
		RequestSpecification requestSpec= given();
		
		
		//specify base URI
//		 requestSpec.baseUri=("https://reqres.in");
//		 requestSpec.basePath=("/api/users/2");
//		 
		//create get request
			Response rs=requestSpec.get();
			
			//validate response header
			String connection=rs.getHeader("Content_Type");
			System.out.println(connection);
			
			//print all headers in uri
			Headers headerList=rs.getHeaders();
			for(Header header:headerList) {
				System.out.println("key:"+header.getName()+ "Value:" +header.getValue());
			}
		  
	}
	
	//validate header content-type, expected value:application/json; charset=utf-8
	//Assert.assertEquals(contentType,"application/json; charset=utf-8","Header content type missmatch."); -getting error


}

