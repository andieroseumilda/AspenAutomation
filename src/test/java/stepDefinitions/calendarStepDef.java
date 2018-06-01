package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendarStepDef {

    public static WebDriver driver;


    @Before
    public void initialize(){
        System.setProperty("webdriver.chrome.driver","..\\automation\\seleniumWebBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("^i open the IBE page$")
    public void iOpenTheIBEPage() {
        // open the IBE page
        driver.get("http://aspen.reservations.com/property/17371/#/stay-dates");
    }

    @Then("^i should see the header copy \"([^\"]*)\"$")
    public void iShouldSeeTheHeaderCopy(String headerCopy) {
      // assert: When would you like to stay
        String calendarHearCopy = driver.findElement(new By.ByCssSelector(".stay-dates-page>h5")).getText();
        Assert.assertEquals("Please see the message below", headerCopy, calendarHearCopy);
    }

    @And("^i should see the hotel banner copy \"([^\"]*)\"$")
    public void iShouldSeeTheHotelBannerCopy(String hotelBannerCopy){
       String hotelPropertyName = driver.findElement(new By.ByCssSelector(".fixed-top>div>div>.mb-0")).getText();
        Assert.assertEquals("Please see the message below", hotelBannerCopy, hotelPropertyName);
    }

    @And("^i should see the hotel country copy \"([^\"]*)\"$")
    public void iShouldSeeTheHotelCountryCopy(String hotelBannerCountry) {
        String hotelCountry = driver.findElement(new By.ByCssSelector(".banner__hotel-country")).getText();
        Assert.assertEquals("Please see the message below", hotelBannerCountry, hotelCountry);
    }

    @And("^i should see the CHECK-IN, TO and CHECK-OUT copy \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldSeeTheCHECKINTOAndCHECKOUTCopyAnd(String expectedCheckIn, String expectedCheckout, String expectedTo) throws Throwable {
        String actualCheckin = driver.findElement(new By.ByCssSelector(".stay-dates-page__dates>.dates-holder>.dates-holder__checkin>div>.dates-holder__dates-label")).getText();
        String actualCheckout = driver.findElement(new By.ByCssSelector(".stay-dates-page__dates>.dates-holder>.dates-holder__checkout>div>.dates-holder__dates-label")).getText();
        String actualTo = driver.findElement(new By.ByCssSelector(".stay-dates-page__dates>div>div+div>.dates-holder__divider-label")).getText();
        Assert.assertEquals("Please see the message below", expectedCheckIn, actualCheckin);
        Assert.assertEquals("Please see the message below",expectedCheckout, actualCheckout);
        Assert.assertEquals("Please see the message below", expectedTo, actualTo);

    }

    @And("^i should see the see rooms button copy \"([^\"]*)\"$")
    public void iShouldSeeTheSeeRoomsButtonCopy(String expectedCopy){
        String actualCopy = driver.findElement(new By.ByCssSelector(".stay-dates-page__btn-see-rooms")).getText();
        Assert.assertEquals("Please see the message below", expectedCopy, actualCopy);
    }
    @After
    public void closeTheWindow() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }



}
