package StepDefinitions;

import PageFragments.BisTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BisSteps {

    TestContext testContext;
    HomePage homePage;
    BisTabFragment bisTabFragment;

    public BisSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the bis tab")
    public void theUserOpensTheBisTab() {

        bisTabFragment = homePage.openBisTab();

    }

    @And("the user fills in the fields needed to generate bis data")
    public void theUserFillsInTheFieldsNeededToGenerateBisData() {

        System.out.println("Implementing BIS...");

    }

    @When("the user clicks on the generate bis button")
    public void theUserClicksOnTheGenerateBisButton() {

        System.out.println("Implementing BIS...");

    }
    @Then("the bis data result is visible")
    public void theBisDataResultIsVisible() {

        System.out.println("Implementing BIS...");

    }

}
