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

    @And("the user selects {string} from the menu of the riziv field")
    public void theUserSelectsFromMenu(String selection) {

        rizivTabFragment.selectFromMenu(selection);

    }

    @And("the user types {string} into the amount input riziv field")
    public void theUserTypesIntoInput(String amount) {

        rizivTabFragment.typeInputs(amount);

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
