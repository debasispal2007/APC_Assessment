import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import io.restassured.RestAssured;

public class negative {

	public static void main(String[] args) {
		
		RestAssured.baseURI=("https://api.oceandrivers.com/v1.0/getAemetStation/aeropuertopalma/");
		given();
			when().get()
				.then()
					.log().all().assertThat().statusCode(404);
		
		
		

	}

}
