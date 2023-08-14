import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_POST {
	

	@Test(enabled = true)
	void test_01() {
		JSONObject req = new JSONObject();
		req.put("title", "QA 091");
		req.put("type", "Agree or Disagree");
		req.put("status", "available");
		req.put("startDate", "2022-07-26");
		req.put("endDate", "2022-07-26");
		
		//System.out.println(req);
		System.out.println(req.toJSONString());
		
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(req).
		when().	
			post("http://localhost:3905/survey/add").
		then().
			statusCode(200).
			log().all();
		
	}

}
