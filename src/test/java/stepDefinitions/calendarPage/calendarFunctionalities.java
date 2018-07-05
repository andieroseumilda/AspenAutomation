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

    @Then("^all the stay dates are all equal$")
    public void allTheStayDatesAreAllEqual() throws InterruptedException {

        System.out.println("\n");
        datesFormat.selectStayDates(2); //click checkin
        datesFormat.selectStayDates(4); //click checkout

        String checkinMonthNameHeader = calendar.getHeaderCheckinMonthName();
        String checkinNumberHeader = calendar.getHeaderCheckinModal();
        String checkoutMonthNameHeader = calendar.getHeaderCheckoutMonthName();
        String checkoutNumberHeader = calendar.getHeaderCheckoutModal();

        //get header month-day
        System.out.println("Header Label    : " + checkinMonthNameHeader +" " +checkinNumberHeader + " to " + checkoutMonthNameHeader + " " +checkoutNumberHeader);
        // get see rooms desc month-day
        String stayDatesOnSeeRoomsButton = calendar.getStayDatesOnSeeRoomButton();
        System.out.println("See Rooms Description : " + stayDatesOnSeeRoomsButton);

    }
}
