package pom;

import Baseclass.Baseclass_Monkeycap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StatusOptionsPage extends Baseclass_Monkeycap {

	private static WebDriver driver;

	public StatusOptionsPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	enum Options {
		Yes, No;
	}

	@FindBy(xpath = "//span[text()='Claimed in Existing Policy?']")
	private WebElement claimed_status_text;

	public WebElement claimed_status_text() {
		return claimed_status_text;
	}

	public String getClaimedStatusText() {
		waitforElementVisiblity(claimed_status_text);
		return claimed_status_text.getText();
	}

	public void setClaimedStatus(String options) {
		waitforElementVisiblity(claimed_status_text);
		Options op = Options.valueOf(options);
		driver.findElement(By.xpath("(//div[contains(@class,'MuiButtonGroup')]/button/span[text()='" + op + "'])[1]")).click();
	}

	@FindBy(xpath = "//span[contains(text(),'Vehicle Ownership')]")
	private WebElement ownership_status_text;

	public WebElement ownership_status_text() {
		return ownership_status_text;
	}

	public String getOwnershipStatusText() {
		waitforElementVisiblity(ownership_status_text);
		return ownership_status_text.getText();
	}

	public void setOwnershipStatus(String options) {
		waitforElementVisiblity(ownership_status_text);
		Options op = Options.valueOf(options);
		driver.findElement(By.xpath("(//div[contains(@class,'MuiButtonGroup')]/button/span[text()='" + op + "'])[2]")).click();
	}

	@FindBy(xpath = "//div[contains(@class,'MuiSelect-select')]")
	private WebElement ncb_dropdown;

	@FindBy(xpath = "//ul[contains(@class,'MuiMenu-list')]/li")
	private List<WebElement> ncb_dropdown_options;

	public WebElement ncb_dropdown() {
		return ncb_dropdown;
	}

	public List<WebElement> ncb_dropdown_options() {
		return ncb_dropdown_options;
	}

	public void selectNCBOption(String NCBOption) {
		waitforElementVisiblity(ncb_dropdown);
		ncb_dropdown.click();
		waitforElementVisiblity(ncb_dropdown_options.get(0));
		for (WebElement element : ncb_dropdown_options) {
			if (element.getText().equalsIgnoreCase(NCBOption)) {
				element.click();
				break;
			}
		}
	}

	@FindBy(xpath = "//span[text()='SUBMIT']")
	private WebElement submit_btn;

	public WebElement submit_btn() {
		return submit_btn;
	}

	public QuotesPage clickSubmit_btn() {
		submit_btn.click();
		return new QuotesPage(driver);
	}

}
