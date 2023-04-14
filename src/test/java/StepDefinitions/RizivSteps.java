package StepDefinitions;

import PageFragments.RizivTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RizivSteps {

    TestContext testContext;
    HomePage homePage;
    RizivTabFragment rizivTabFragment;

    public RizivSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the riziv tab")
    public void theUserOpensTheRizivTab() {

        rizivTabFragment = homePage.openRizivTab();

    }

    @And("the user fills in the fields needed to generate riziv data")
    public void theUserFillsInTheFieldsNeededToGenerateRizivData() {

        System.out.println("Implementing RIZIV...");

    }

    @When("the user clicks on the generate riziv button")
    public void theUserClicksOnTheGenerateRizivButton() {

        rizivTabFragment.clickGenerateButton();

    }
    @Then("the riziv data result is visible")
    public void theRizivDataResultIsVisible() {

        Assert.assertTrue(rizivTabFragment.isResultDisplayed());

    }

}
