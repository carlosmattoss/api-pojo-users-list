package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import io.restassured.RestAssured;
import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class BaseTest extends ExtentReportListner{
	
	@BeforeClass
	public void baseTest() {
		
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
	}

}
