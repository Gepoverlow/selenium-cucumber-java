package StepDefinitions;

import PageFragments.BisTabFragment;
import PageFragments.LoremTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoremSteps {

    TestContext testContext;
    HomePage homePage;
    LoremTabFragment loremTabFragment;

    public LoremSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the lorem tab")
    public void theUserOpensTheLoremTab() {

        loremTabFragment = homePage.openLoremTab();

    }

    @And("the user fills in the fields needed to generate lorem data")
    public void theUserFillsInTheFieldsNeededToGenerateLoremData() {

        System.out.println("Implementing LOREM...");

    }

    @When("the user clicks on the generate lorem button")
    public void theUserClicksOnTheGenerateLoremButton() {

        loremTabFragment.clickGenerateButton();

    }
    @Then("the lorem data result is visible")
    public void theLoremDataResultIsVisible() {

        System.out.println("Implementing LOREM...");

    }

}
