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
        homePage = testContext.getPageObjectManager().getHomePage();

    }
    @And("the user scrolls to the uuid tab")
    public void the_user_scrolls_to_the_uuid_tab() throws InterruptedException {

        homePage.uuid.scrollToTabHeader(homePage.uuid.getHeaderButton());

    }
    @And("the user clicks on the uuid header button")
    public void the_user_clicks_on_the_uuid_header_button() throws InterruptedException {

        homePage.uuid.clickTabHeader(homePage.uuid.getHeaderButton());

    }
    @And("the uuid form opens")
    public void the_uuid_form_opens() {

        Assert.assertTrue(homePage.uuid.isElementDisplayed(homePage.uuid.getTabBodyDiv()));

    }


    @And("the uuid tab body is centered")
    public void the_uuid_tab_is_centered() throws InterruptedException {

        homePage.uuid.scrollToCenterTabBody(homePage.uuid.getTabBodyDiv());

    }

    @And("the user fills in the uuid form")
    public void the_user_fills_in_the_uuid_form(){

        System.out.println("Implementing...");

    }


    @When("the user clicks on the generate uuid button")
    public void the_user_clicks_on_the_generate_uuid_button() throws InterruptedException {

        homePage.uuid.clickGenerateButton(homePage.uuid.getGenerateButton());

    }

    @Then("the uuid result is visible")
    public void the_uuid_result_is_visible(){

        Assert.assertTrue(homePage.uuid.isElementDisplayed(homePage.uuid.getResultPre()));

    }

}
