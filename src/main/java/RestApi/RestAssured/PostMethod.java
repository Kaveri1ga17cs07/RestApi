package RestApi.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostMethod {
	@Test
	public void test03() {  //click on  method and run as testNg

		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "kaveri");
		jsonData.put("job", "Q8");

		RestAssured.baseURI ="https://reqres.in/api/users";
		RestAssured.given().header("Content-type", "application/json")
		.contentType(ContentType.JSON)
		.body(jsonData.toJSONString())
		.when().post()
		.then().statusCode(201).log().all();

	}

}
