package StepDefinitions;

import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UuidSteps {

    TestContext testContext;
    HomePage homePage;

    public UuidSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the uuid tab")
    public void theUserOpensTheUuidTab() {

        System.out.println("the user opens the uuid tab");

    }

    @And("the user fills in the fields needed to generate uuid data")
    public void theUserFillsInTheFieldsNeededToGenerateUuidData() {

        System.out.println("the user fills in the fields needed to generate uuid data");

    }

    @When("the user clicks on the generate uuid button")
    public void theUserClicksOnTheGenerateUuidButton() {

        System.out.println("the user clicks on the generate uuid button");

    }
    @Then("the uuid data result is visible")
    public void theUuidDataResultIsVisible() {

        System.out.println("The uuid data result is visible");

    }

}
