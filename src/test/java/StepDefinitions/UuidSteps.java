package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UuidSteps {

    ContextSteps contextSteps;
    HomePage home;

    public UuidSteps(ContextSteps context){

        contextSteps = context;
        home = contextSteps.getHome();

    }
    @And("the user scrolls to the uuid tab")
    public void the_user_scrolls_to_the_uuid_tab() throws InterruptedException {

        home.uuid.scrollToTabHeader(home.uuid.getHeaderButton());

    }
    @And("the user clicks on the uuid header button")
    public void the_user_clicks_on_the_uuid_header_button() throws InterruptedException {

        home.uuid.clickTabHeader(home.uuid.getHeaderButton());

    }
    @And("the uuid form opens")
    public void the_uuid_form_opens() {

        Assert.assertTrue(home.uuid.isElementDisplayed(home.uuid.getTabBodyDiv()));

    }


    @And("the uuid tab body is centered")
    public void the_uuid_tab_is_centered() throws InterruptedException {

        home.uuid.scrollToCenterTabBody(home.uuid.getTabBodyDiv());

    }

    @And("the user fills in the uuid form")
    public void the_user_fills_in_the_uuid_form(){

        System.out.println("Implementing...");

    }


    @When("the user clicks on the generate uuid button")
    public void the_user_clicks_on_the_generate_uuid_button() throws InterruptedException {

        home.uuid.clickGenerateButton(home.uuid.getGenerateButton());

    }

    @Then("the uuid result is visible")
    public void the_uuid_result_is_visible(){

        Assert.assertTrue(home.uuid.isElementDisplayed(home.uuid.getResultPre()));

    }

}
