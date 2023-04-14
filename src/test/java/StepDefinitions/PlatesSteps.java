package StepDefinitions;

import PageFragments.PlatesTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PlatesSteps {

    TestContext testContext;
    HomePage homePage;
    PlatesTabFragment platesTabFragment;

    public PlatesSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the plates tab")
    public void theUserOpensThePlatesTab() {

        platesTabFragment = homePage.openPlatesTab();

    }

    @And("the user fills in the fields needed to generate plates data")
    public void theUserFillsInTheFieldsNeededToGeneratePlatesData() {

        System.out.println("Implementing PLATES...");

    }

    @When("the user clicks on the generate plates button")
    public void theUserClicksOnTheGeneratePlatesButton() {

        platesTabFragment.clickGenerateButton();

    }
    @Then("the plates data result is visible")
    public void thePlatesDataResultIsVisible() {

        Assert.assertTrue(platesTabFragment.isResultDisplayed());

    }

}
