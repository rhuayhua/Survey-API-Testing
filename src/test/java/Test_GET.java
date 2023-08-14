import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import models.Survey;


public class Test_GET {
	
	@Test(enabled = true)
	void test_01() {
		
		given().
			get("http://localhost:3905/survey/list_attend").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test(enabled = true)
	void test_02() {
		
		Response response = get("http://localhost:3905/survey/list_attend");
		Survey[] surveys = response.getBody().as(Survey[].class);
		
		for (Survey s: surveys) {
			System.out.println(s.toString());
		}
		
		System.out.println(surveys[0].getTitle());
		System.out.println(surveys[1].getTitle());
		Assert.assertEquals(surveys[1].getTitle(), "QA 009");
	}

}
