package StepDefinitions;

import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BisSteps {

    TestContext testContext;
    HomePage homePage;

    public BisSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the bis tab")
    public void theUserOpensTheBisTab() {

        homePage.openBisTab();

    }

    @And("the user fills in the fields needed to generate bis data")
    public void theUserFillsInTheFieldsNeededToGenerateBisData() {

        homePage.fillInBisFields();

    }

    @When("the user clicks on the generate bis button")
    public void theUserClicksOnTheGenerateBisButton() {

        homePage.clickGenerateBisButton();

    }
    @Then("the bis data result is visible")
    public void theBisDataResultIsVisible() {

        homePage.verifyResultIsVisible();

    }

}
