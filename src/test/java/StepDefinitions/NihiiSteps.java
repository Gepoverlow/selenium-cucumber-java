package StepDefinitions;

import PageFragments.NihiiTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NihiiSteps {

    TestContext testContext;
    HomePage homePage;
    NihiiTabFragment nihiiTabFragment;

    public NihiiSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the nihii tab")
    public void theUserOpensTheNihiiTab() {

        nihiiTabFragment = homePage.openNihiiTab();

    }

    @And("the user fills in the fields needed to generate nihii data")
    public void theUserFillsInTheFieldsNeededToGenerateNihiiData() {

        System.out.println("Implementing NIHII...");

    }

    @When("the user clicks on the generate nihii button")
    public void theUserClicksOnTheGenerateNihiiButton() {

        nihiiTabFragment.clickGenerateButton();

    }
    @Then("the nihii data result is visible")
    public void theNihiiDataResultIsVisible() {

        Assert.assertTrue(nihiiTabFragment.isResultDisplayed());

    }

}
