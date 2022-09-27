package runner;


import Baseclass.Baseclass_Monkeycap;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/Monkeycap.feature", glue ="src/test/java/stepdefinitions/Homepage_Stepdefinitions")


public class Runner_Monkeycap extends Baseclass_Monkeycap {

    protected static WebDriver driver;

    @BeforeClass

    public static void setUp() throws Throwable {
        Baseclass_Monkeycap.readPropertyFile();
        Baseclass_Monkeycap.setExtentReport();
        Baseclass_Monkeycap.setBrowser(Baseclass_Monkeycap.prop.getProperty("browserName").toString());
        Baseclass_Monkeycap.getUrl();
    }


        @AfterClass


        public static void report() {
        Baseclass_Monkeycap.extent.flush();
        Baseclass_Monkeycap.driver.quit();


    }

}
