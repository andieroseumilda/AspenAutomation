package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendarStepDef {

    public static WebDriver driver;


    @Before
    public void initialize(){
        System.setProperty("webdriver.chrome.driver","..\\automation\\seleniumWebBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^i open the IBE page$")
    public void iOpenTheIBEPage() {
        // open the IBE page
        driver.get("http://www.google.com");
        System.out.println("Test only");
    }

    @When("^i should see the Google label$")
    public void iShouldSeeTheGoogleLabel() {
        System.out.println("Google copy");
    }

    @Then("^i verify that the hotel property is on the page$")
    public void iVerifyThatTheHotelPropertyIsOnThePage() throws InterruptedException {
        System.out.println("Test only");
        Thread.sleep(3000);
    }

    @After
    public void closeTheWindow(){
        driver.quit();
    }

}
