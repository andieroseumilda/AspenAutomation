package stepDefinitions.happyPath;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.util.PendingException;
import support.baseUtil;
import support.controller.stayDatesFormat;
import support.locatorsAndMethods.calendarPageLocator;

public class happyPath extends baseUtil {

    private baseUtil base;
    private stayDatesFormat datesFormat;
    private calendarPageLocator calendar;

    public happyPath(baseUtil base) {
        this.base = base;
        this.datesFormat = new stayDatesFormat(base);
        this.calendar = new calendarPageLocator(base);
    }

    @When("^i select my desired stay dates from (\\d+) days from now to (\\d+) days from now$")
    public void i_select_my_desired_stay_dates_from_days_from_now_to_days_from_now(int checkin_noOfDaysFromNow, int checkout_noOfDaysFromNow) {
            calendar.getStayDatesButton();
            datesFormat.selectStayDates(checkin_noOfDaysFromNow); //click checkin

            datesFormat.selectStayDates(checkout_noOfDaysFromNow); //click checkout
            calendar.getStayDatesOnSeeRoomButton().click();
    }

    @When("^i select my desired rooms$")
    public void i_select_my_desired_rooms() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^i input my guest information$")
    public void i_input_my_guest_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^i input my cc details$")
    public void i_input_my_cc_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^i should redirected to confirmation page$")
    public void i_should_redirected_to_confirmation_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
