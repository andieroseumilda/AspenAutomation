package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calendarStepDef {
    @Given("^i launch the chrome$")
    public void iLaunchTheChrome() {
        System.out.println("Test only");
    }

    @When("^i open the IBE page$")
    public void iOpenTheIBEPage() {
        System.out.println("Test only");
    }

    @Then("^i verify that the hotel property is on the page$")
    public void iVerifyThatTheHotelPropertyIsOnThePage() {
        System.out.println("Test only");
    }
}
