import io.restassured.*;
import static io.restassured.RestAssured.*;

public class APCAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI=("https://api.oceandrivers.com/v1.0/getAemetStation/aeropuertopalma/lastdata/");
		given();
		when().get()
		.then()
		.log().all().assertThat().statusCode(200);
		
	}

}