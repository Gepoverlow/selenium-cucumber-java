package StepDefinitions;

import PageFragments.UuidTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UuidSteps {

    TestContext testContext;
    HomePage homePage;

    UuidTabFragment uuidTabFragment;

    public UuidSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the uuid tab")
    public void theUserOpensTheUuidTab() {

        uuidTabFragment = homePage.openUuidTab();

    }

    @And("the user types {string} into the version input and {string} into the amount input uuid fields")
    public void theUserTypesIntoInputs(String version, String amount) {

        uuidTabFragment.typeInputs(version, amount);

    }

    @When("the user clicks on the generate uuid button")
    public void theUserClicksOnTheGenerateUuidButton() {

        uuidTabFragment.clickGenerateButton();

    }

    @Then("the uuid data result is visible")
    public void theUuidDataResultIsVisible() {

        Assert.assertTrue(uuidTabFragment.isResultDisplayed());

    }

}
