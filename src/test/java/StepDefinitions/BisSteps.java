package StepDefinitions;

import PageFragments.BisTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

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

    @And("the user clicks on the {string} input of isGenderKnown and {string} of the isBirthdayKnown bis field")
    public void theUserClicksOnInputs(String genderKnown, String dobKnown) {

        bisTabFragment.clickInputs(genderKnown, dobKnown);

    }

    @And("the user types {string} into the date input and {string} into the amount input bis fields")
    public void theUserFillsInTheFieldsNeededToGenerateBisData(String date, String amount) {

        bisTabFragment.typeInputs(date, amount);

    }

    @When("the user clicks on the generate bis button")
    public void theUserClicksOnTheGenerateBisButton() {

        bisTabFragment.clickGenerateButton();

    }
    @Then("the bis data result is visible")
    public void theBisDataResultIsVisible() {

        Assert.assertTrue(bisTabFragment.isResultDisplayed());

    }

}
