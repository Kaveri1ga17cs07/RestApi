package RestApi.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteMethod {
	@Test
	public void Test05() {
	

	RestAssured.baseURI ="https://reqres.in/api/users/594";
	RestAssured.given().

	when().delete()
	.then().statusCode(204)
	.log().all();

	}

}
