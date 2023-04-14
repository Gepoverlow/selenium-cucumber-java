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

    @And("the user selects {string} from the menu of the telephone field")
    public void theUserSelectsFromMenu(String selection) {

        telephoneTabFragment.selectFromMenu(selection);

    }

    @And("the user types {string} into the amount input telephone field")
    public void theUserTypesIntoInput(String amount) {

        telephoneTabFragment.typeInputs(amount);

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
