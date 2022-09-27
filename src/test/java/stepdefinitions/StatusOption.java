package stepdefinitions;

import Baseclass.Baseclass_Monkeycap;

import cucumber.api.java.en.When;
import pom.StatusOptionsPage;

public class StatusOption extends Baseclass_Monkeycap {
	StatusOptionsPage statusOptionsPage = null;
	
	@When("^User chooses \"([^\"]*)\" as Claimed Status$")
	public void user_chooses_as_Claimed_Status(String arg1) throws Throwable {
		statusOptionsPage = new StatusOptionsPage(driver);
		statusOptionsPage.setClaimedStatus(arg1);
		test.info("User chooses Claimed Status : "+arg1);
	}

	@When("^User chooses \"([^\"]*)\" as Ownership change Status$")
	public void user_chooses_as_Ownership_change_Status(String arg1) throws Throwable {
		statusOptionsPage.setOwnershipStatus(arg1);
		test.info("User chooses Ownership Status : "+arg1);
	}

	@When("^User chooses \"([^\"]*)\" in No Claim Bonus dropdown$")
	public void user_chooses_in_No_Claim_Bonus_dropdown(String arg1) throws Throwable {
		statusOptionsPage.selectNCBOption(arg1);
		test.info("User chooses No Claim Bonus Status : "+arg1);
	}

	@When("^User click on SUBMIT button$")
	public void user_click_on_SUBMIT_button() throws Throwable {
		statusOptionsPage.clickSubmit_btn();
	}
}
