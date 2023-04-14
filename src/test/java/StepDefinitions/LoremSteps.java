package StepDefinitions;

import PageFragments.LoremTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

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

    @And("the user clicks on the {string} input of lettersOnly lorem field")
    public void theUserClicksOnInputs(String lettersOnly) {

        loremTabFragment.clickInputs(lettersOnly);

    }

    @And("the user types {string} into the length input lorem field")
    public void theUserTypesIntoInputs(String length) {

        loremTabFragment.typeInputs(length);

    }

    @When("the user clicks on the generate lorem button")
    public void theUserClicksOnTheGenerateLoremButton() {

        loremTabFragment.clickGenerateButton();

    }
    @Then("the lorem data result is visible")
    public void theLoremDataResultIsVisible() {

        Assert.assertTrue(loremTabFragment.isResultDisplayed());

    }

}
