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

    @And("the user selects {string} from the menu of the plates field")
    public void theUserSelectsFromMenu(String selection) {

        platesTabFragment.selectFromMenu(selection);

    }

    @And("the user types {string} into the amount input plates field")
    public void theUserTypesIntoInput(String amount) {

        platesTabFragment.typeInputs(amount);

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
