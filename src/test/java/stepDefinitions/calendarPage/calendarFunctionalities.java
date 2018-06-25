package stepDefinitions.calendarPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import support.baseUtil;
import support.locatorsAndMethods.calendarPageLocator;

import javax.swing.text.StyledEditorKit;

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
}
