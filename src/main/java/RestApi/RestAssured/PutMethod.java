package RestApi.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutMethod {
	@Test
	public void test04() {  //click on  method and run as testNg

		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "shridhar");
		jsonData.put("job", "Q8");

		RestAssured.baseURI ="https://reqres.in/api/users/594";
		RestAssured.given().header("Content-type", "application/json")
		.contentType(ContentType.JSON)
		.body(jsonData.toJSONString())
		.when().put()
		.then().statusCode(200).log().all();

	}

}
