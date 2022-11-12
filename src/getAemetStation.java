import io.restassured.*;
import static io.restassured.RestAssured.*;


public class getAemetStation {

			public static void main(String[] args) {
			
				RestAssured.baseURI=("https://api.oceandrivers.com/v1.0/getAemetStation/aeropuertopalma/lastdata/");
				given();
					when().get()
						.then()
							.log().all().assertThat().statusCode(200);
				
			}

}
