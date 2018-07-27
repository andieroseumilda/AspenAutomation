package stepDefinitions.calendarPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import support.baseUtil;
import support.controller.stayDatesFormat;
import support.locatorsAndMethods.calendarPageLocator;

public class calendarFunctionalities extends baseUtil {

    public baseUtil base;
    public calendarPageLocator calendar;
    public stayDatesFormat datesFormat;

    public calendarFunctionalities(baseUtil base) {
        this.base = base;
        calendar = new calendarPageLocator(base);
        datesFormat = new stayDatesFormat(base);
    }

    @When("^i open the IBE page$")
    public void  iOpenTheIBEPage(){
        // open the IBE page
        base.driver.get("http://aspen.reservations.com/hotel/17371/#/stay-dates");
//        base.driver.get("http://aspen-reservations.directwithhotels.com/hotel/17371/#/stay-dates");
    }

    @When("^i click the stay dates box")
    public void iClickTheStayDatesSection() {
        calendar.getStayDatesButton();
    }

    @When("^i click the show rates$")
    public void iClickTheShowRates() throws InterruptedException {
        calendar.clickButtonShowRates();
        Thread.sleep(2000);
    }

    @Then("^i should see the lowest, median and highest rates$")
    public void iShouldSeeTheLowestMedianAndHighestRates(){
        System.out.println("test");
        Boolean lowRatesMenu = calendar.getLowRates();
        Assert.assertTrue("Please see error message", lowRatesMenu);
//        Boolean medianRatesMenu = calendar.getMedianRates();
//        Assert.assertTrue(medianRatesMenu);
    }

    @When("^i click the holiday$")
    public void iClickTheHoliday(){
        calendar.clickButtonHoliday();
    }

    @When("^i select stay dates from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_select_stay_dates_from_to(String checkin, String checkout)  {
        int numberOfDay;
        if(checkin.equalsIgnoreCase("today")){
            numberOfDay = 0;
            datesFormat.selectStayDates(numberOfDay); //click checkin
        }
        if (checkout.equalsIgnoreCase("tomorrow")){
            numberOfDay = 1;
            datesFormat.selectStayDates(numberOfDay); //click checkout
        }
    }

    @Then("^all the stay dates are all equal$")
    public void allTheStayDatesAreAllEqual() {
        String checkinMonthNameHeader = calendar.getHeaderCheckinMonthName();
        String checkinNumberHeader = calendar.getHeaderCheckinModal();
        String checkoutMonthNameHeader = calendar.getHeaderCheckoutMonthName();
        String checkoutNumberHeader = calendar.getHeaderCheckoutModal();

        //get header month-day
        String headerDate = checkinMonthNameHeader +" " +checkinNumberHeader + " to " + checkoutMonthNameHeader + " " +checkoutNumberHeader;
        // get see rooms desc month-day
        String stayDatesOnSeeRoomsButton = calendar.getStayDatesOnSeeRoomButton().getText();
        Assert.assertEquals("Please see this message: " , headerDate.toLowerCase(),stayDatesOnSeeRoomsButton.toLowerCase());

    }
}
