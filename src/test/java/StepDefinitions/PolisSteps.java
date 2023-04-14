package StepDefinitions;

import PageFragments.PolisTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PolisSteps {

    TestContext testContext;
    HomePage homePage;
    PolisTabFragment polisTabFragment;

    public PolisSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the polis tab")
    public void theUserOpensThePolisTab() {

        polisTabFragment = homePage.openPolisTab();

    }

    @And("the user selects {string} from the menu of the polis field")
    public void theUserSelectsFromMenu(String selection) {

        polisTabFragment.selectFromMenu(selection);

    }

    @And("the user types {string} into the amount input polis field")
    public void theUserTypesIntoInput(String amount) {

        polisTabFragment.typeInputs(amount);

    }

    @When("the user clicks on the generate polis button")
    public void theUserClicksOnTheGeneratePolisButton() {

        polisTabFragment.clickGenerateButton();

    }
    @Then("the polis data result is visible")
    public void thePolisDataResultIsVisible() {

        Assert.assertTrue(polisTabFragment.isResultDisplayed());

    }

}
