package stepdefinitions;

import Baseclass.Baseclass_Monkeycap;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pom.HomePage;

public class Homepage extends Baseclass_Monkeycap{
	HomePage homePage = null;
	
	@Given("^User landed into the Application$")
	public void user_landed_into_the_Application() throws Throwable {
		homePage = new HomePage(Baseclass_Monkeycap.driver);
		Assert.assertTrue(Baseclass_Monkeycap.elementIsDisplayed(homePage.carSection()));
		test = Baseclass_Monkeycap.extent.createTest("Test One").info("User landed into the Application");
	}

	@When("^User inputs the Registration number of the vehicle \"([^\"]*)\"$")
	public void user_inputs_the_Registration_number_of_the_vehicle(String arg1) throws Throwable {
		homePage.set_search_input(arg1);
		test.info("User inputs the Registration number of the vehicle : "+arg1);
	}

	@When("^User click on Get Quotes button$")
	public void user_click_on_Get_Quotes_button() throws Throwable {
		homePage.click_get_quote();
	}
}
