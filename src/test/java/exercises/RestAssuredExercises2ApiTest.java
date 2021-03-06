package exercises;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;

@RunWith(DataProviderRunner.class)
public class RestAssuredExercises2ApiTest extends BaseApiTest {
	
	/*******************************************************
	 * Create a DataProvider that specifies in which country
	 * a specific circuit can be found (specify that Monza 
	 * is in Italy, for example) 
	 ******************************************************/

	/*******************************************************
	 * Create a DataProvider that specifies for all races
	 * (adding the first four suffices) in 2015 how many  
	 * pit stops Max Verstappen made
	 * (race 1 = 1 pitstop, 2 = 3, 3 = 2, 4 = 2)
	 ******************************************************/

	/*******************************************************
	 * Request data for a specific circuit (for Monza this 
	 * is /circuits/monza.json)
	 * and check the country this circuit can be found in
	 ******************************************************/
	
	@Test
	public void checkCountryForCircuit() {
		
		given().
			spec(createRequestSpecification()).
		when().
		then();
	}
	
	/*******************************************************
	 * Request the pitstop data for the first four races in
	 * 2015 for Max Verstappen (for race 1 this is
	 * /2015/1/drivers/max_verstappen/pitstops.json)
	 * and verify the number of pit stops made
	 ******************************************************/
	
	@Test
	public void checkNumberOfPitstopsForMaxVerstappenIn2015() {
		
		given().
			spec(createRequestSpecification()).
		when().
		then();
	}
}