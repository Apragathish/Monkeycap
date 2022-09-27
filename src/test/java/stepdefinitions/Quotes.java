package stepdefinitions;

import Baseclass.Baseclass_Monkeycap;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pom.QuotesPage;

public class Quotes extends Baseclass_Monkeycap {
	QuotesPage quotesPage = null;
	
	@Then("^User lands in Quotes page successfully$")
	public void user_lands_in_Quotes_page_successfully() throws Throwable {
		quotesPage = new QuotesPage(Baseclass_Monkeycap.driver);
	    Assert.assertTrue(Baseclass_Monkeycap.elementIsDisplayed(quotesPage.get_policy_list().get(0)));
	    test.info("User landed in Quotes page successfully");
	}
	
	@Then("^User validates results Quotes are displayed$")
	public void user_validates_results_Quotes_are_displayed() throws Throwable {
	    Assert.assertTrue(Baseclass_Monkeycap.elementIsDisplayed(quotesPage.get_premium_list().get(0)));
	    test.info("User validated results Quotes are displayed");
	}
}
