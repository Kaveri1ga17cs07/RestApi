package RestApi.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestApi {
	
@Test
	public void FirstClass() {
	Response rs  = RestAssured.get("https://reqres.in/api/users/2");
	System.out.println(rs.asString());
	System.out.println(rs.getStatusCode());
	}

	

}
