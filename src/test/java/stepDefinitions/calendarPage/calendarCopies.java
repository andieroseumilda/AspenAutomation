package stepDefinitions.calendarPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.locatorsAndMethods.calendarPageLocator;
import org.junit.Assert;
import support.stayDatesFormat;
import support.baseUtil;


//extend to next class to get the variable / container
public class calendarCopies extends baseUtil {

    // data type(class) and variable name
    public baseUtil base;
    public calendarPageLocator calendar;
    public stayDatesFormat dateFormat;


    // running an instance getting and assigning variable
    public calendarCopies(baseUtil base) {
        this.base = base;
        calendar = new calendarPageLocator(base);
        dateFormat = new stayDatesFormat(base);

    }

    @When("^i open the IBE page$")
    public void iOpenTheIBEPage() throws InterruptedException {
        // open the IBE page
        base.driver.get("http://aspen.reservations.com/hotel/17371/#/stay-dates");
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


    @And("^i should see the date today and tomorrow on the stay dates sections$")
    public void iShouldSeeTheDateTodayAndTomorrowOnTheStayDatesSections() {
        //get the date today
        String getActualCheckinDay = calendar.getNumberOfCheckinDay();
        String expectedCheckinDay = dateFormat.selectStayDate(0);
        Assert.assertEquals("Please see the message below",expectedCheckinDay,getActualCheckinDay );
        //and date tomorrow
        String getActualCheckoutDate = calendar.getNumberofCheckoutDay();
        String expectedCheckoutDay = dateFormat.selectStayDate(1);
        Assert.assertEquals("Please see the message below",expectedCheckoutDay,getActualCheckoutDate );

    }

    // Calendar Modal

    @Then("^i should see these Labels \"([^\"]*)\", \"([^\"]*)\" , and \"([^\"]*)\"$")
    public void iShouldSeeTheseLabelsAnd(String expectedCheckinLabelModal, String expectedToLabelModal, String expectedCheckoutLabelModal) {
        // compare the actual and expected CHECKIN label in modal
        String getActualCheckinLabelModal = calendar.getCheckinLabelModal();
        Assert.assertEquals("Please see the message below", expectedCheckinLabelModal, getActualCheckinLabelModal );
        // compare the actual and expected TO label in modal
        String getActualToLabelModal = calendar.getToLabelModal();
        Assert.assertEquals("Please see the message below", expectedToLabelModal, getActualToLabelModal);
        // compare the actual and expected CHECKOUT label in modal
        String getActualCheckoutLabelModal = calendar.getCheckoutLabelModal();
        Assert.assertEquals("Please see the message below", expectedCheckoutLabelModal, getActualCheckoutLabelModal);

    }
}