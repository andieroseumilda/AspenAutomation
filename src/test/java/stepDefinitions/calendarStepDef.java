package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locatorsAndMethods.calendarLocator;
import org.junit.Assert;
import support.stayDatesFormat;
import support.baseUtil;


//extend to next class to get the variable / container
public class calendarStepDef extends baseUtil {

    // data type(class) and variable name
    public baseUtil base;
    public calendarLocator calendar;
    public stayDatesFormat dateFormat;


    // running an instance getting and assigning variable
    public calendarStepDef(baseUtil base) {
        this.base = base;
        calendar = new calendarLocator(base);
        dateFormat = new stayDatesFormat(base);
    }

    @When("^i open the IBE page$")
    public void iOpenTheIBEPage() throws InterruptedException {
        // open the IBE page
        base.driver.get("http://aspen.reservations.com/property/17371/#/stay-dates");
        dateFormat.selectArrivalDate();

    }

    @Then("^i should see the header copy \"([^\"]*)\"$")
    public void iShouldSeeTheHeaderCopy(String headerCopy) {
        String calendarHeaderCopy = calendar.getCalendarHeaderCopy();
        Assert.assertEquals("Please see the message below", headerCopy, calendarHeaderCopy);
    }

    @And("^i should see the hotel banner copy \"([^\"]*)\"$")
    public void iShouldSeeTheHotelBannerCopy(String hotelBannerCopy){
       String hotelPropertyName = calendar.getHotelPropertyName();
        Assert.assertEquals("Please see the message below", hotelBannerCopy, hotelPropertyName);
    }

    @And("^i should see the hotel country copy \"([^\"]*)\"$")
    public void iShouldSeeTheHotelCountryCopy(String hotelBannerCountry) {
        String hotelCountry = calendar.getHotelCountry();
        Assert.assertEquals("Please see the message below", hotelBannerCountry, hotelCountry);
    }

    @And("^i should see the CHECK-IN, TO and CHECK-OUT copy \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldSeeTheCHECKINTOAndCHECKOUTCopyAnd(String expectedCheckIn, String expectedCheckout, String expectedTo) throws Throwable {
        String actualCheckin = calendar.getCheckInLabel();
        String actualCheckout = calendar.getCheckoutLabel();
        String actualTo = calendar.getToLabel();
        Assert.assertEquals("Please see the message below", expectedCheckIn, actualCheckin);
        Assert.assertEquals("Please see the message below",expectedCheckout, actualCheckout);
        Assert.assertEquals("Please see the message below", expectedTo, actualTo);

    }

    @And("^i should see the see rooms button copy \"([^\"]*)\"$")
    public void iShouldSeeTheSeeRoomsButtonCopy(String expectedCopy){
        String actualCopy = calendar.getSeeRooms().getText();
        Assert.assertEquals("Please see the message below", expectedCopy, actualCopy);
    }




}
