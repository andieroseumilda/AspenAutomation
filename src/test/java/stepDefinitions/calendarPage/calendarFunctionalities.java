package stepDefinitions.calendarPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.baseUtil;
import support.locatorsAndMethods.calendarPageLocator;

public class calendarFunctionalities extends baseUtil {

    public baseUtil base;
    public calendarPageLocator calendar;

    public calendarFunctionalities(baseUtil base) {
        this.base = base;
        calendar = new calendarPageLocator(base);
    }

    @When("^i click the stay dates section$")
    public void iClickTheStayDatesSection() {
        calendar.getStayDatesButton();
    }

    @When("^i click the show rates$")
    public void iClickTheShowRates() {
        calendar.clickButtonShowRates();

    }

    @Then("^i should see the lowest, median and highest rates$")
    public void iShouldSeeTheLowestMedianAndHighestRates(){
        System.out.println("test");
    }
}
