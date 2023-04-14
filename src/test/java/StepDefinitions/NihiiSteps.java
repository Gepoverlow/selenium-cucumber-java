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

    @And("the user selects {string} from the menu of the nihii field")
    public void theUserSelectsFromMenu(String selection) {

        nihiiTabFragment.selectFromMenu(selection);

    }

    @And("the user types {string} into the version input and {string} into the amount input nihii fields")
    public void theUserTypesIntoInputs(String version, String amount) {

        nihiiTabFragment.typeInputs(version, amount);

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
