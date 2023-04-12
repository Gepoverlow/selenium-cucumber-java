package StepDefinitions;

import PageFragments.UuidTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @And("the user fills in the fields needed to generate uuid data")
    public void theUserFillsInTheFieldsNeededToGenerateUuidData() {

        System.out.println("Implementing...");

    }

    @When("the user clicks on the generate uuid button")
    public void theUserClicksOnTheGenerateUuidButton() {

        System.out.println("Implementing...");

    }
    @Then("the uuid data result is visible")
    public void theUuidDataResultIsVisible() {

        System.out.println("Implementing...");

    }

}
