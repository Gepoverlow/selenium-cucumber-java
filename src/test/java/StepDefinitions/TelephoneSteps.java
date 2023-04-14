package StepDefinitions;

import PageFragments.TelephoneTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

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

        telephoneTabFragment.clickGenerateButton();

    }
    @Then("the telephone data result is visible")
    public void theTelephoneDataResultIsVisible() {

        Assert.assertTrue(telephoneTabFragment.isResultDisplayed());

    }

}
