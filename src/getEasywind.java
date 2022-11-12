import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import io.restassured.RestAssured;

public class getEasywind {

	public static void main(String[] args) {

		RestAssured.baseURI=("https://api.oceandrivers.com/v1.0/getEasyWind/EW013/?period=latestdata");
		given();
			when().get()
				.then()
					.log().all().assertThat().statusCode(200);

	}

}
