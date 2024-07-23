import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void verifyApiResponce() {
		RestAssured.baseURI = "https://plus.dnb.com/";

		String responce = given().log().all().contentType(ContentType.JSON).auth()
				.oauth2("2GR469UxSBF57TE18G10mob81ZA6").queryParam("blockIDs", "companyinfo_L3_v1").when()
				.get("v1/data/duns/081466849").then().assertThat().statusCode(200).extract().response().asString();
		JsonPath js1 = new JsonPath(responce);
		String jsonPrimaryName = js1.getString("organization.primaryName");
		System.out.println("JSON primaryName is " + jsonPrimaryName);
		
		
		//assertEquals(false, null);
	}

}