package StepDefinitions;

import PageFragments.BisTabFragment;
import PageFragments.TelephoneTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TelephoneSteps {

    TestContext testContext;
    HomePage homePage;
    TelephoneTabFragment telephoneTabFragment;

    public TelephoneSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the telephone tab")
    public void theUserOpensTheTelephoneTab() {

        telephoneTabFragment = homePage.openTelephoneTab();

    }

    @And("the user fills in the fields needed to generate telephone data")
    public void theUserFillsInTheFieldsNeededToGenerateTelephoneData() {

        System.out.println("Implementing TELEPHONE...");

    }

    @When("the user clicks on the generate telephone button")
    public void theUserClicksOnTheGenerateTelephoneButton() {

        System.out.println("Implementing TELEPHONE...");

    }
    @Then("the telephone data result is visible")
    public void theTelephoneDataResultIsVisible() {

        System.out.println("Implementing TELEPHONE...");

    }

}
