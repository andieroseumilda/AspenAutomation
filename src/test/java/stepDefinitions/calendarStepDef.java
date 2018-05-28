package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendarStepDef {

    public static WebDriver driver;

    @Given("^i launch the chrome$")
    public void iLaunchTheChrome() {
        // open chrome browser
        System.setProperty("webdriver.chrome.driver","..\\automation\\seleniumWebBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("^i open the IBE page$")
    public void iOpenTheIBEPage() {
        // open the IBE page
        driver.get("http://www.google.com");
        System.out.println("Test only");
    }

    @Then("^i verify that the hotel property is on the page$")
    public void iVerifyThatTheHotelPropertyIsOnThePage() {
        System.out.println("Test only");
    }
}
