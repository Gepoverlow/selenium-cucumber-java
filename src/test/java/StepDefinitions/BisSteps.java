package StepDefinitions;

import PageFragments.BisTabFragment;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BisSteps {

    ContextSteps contextSteps;
    HomePage home;

    public BisSteps(ContextSteps context){

        contextSteps = context;
        home = contextSteps.getHome();

    }
    @And("the user scrolls to the bis tab")
    public void the_user_scrolls_to_the_bis_tab() throws InterruptedException {

        home.bis.scrollToTabHeader(home.bis.getHeaderButton());

    }
    @And("the user clicks on the bis header button")
    public void the_user_clicks_on_the_bis_header_button() throws InterruptedException {

        home.bis.clickTabHeader(home.bis.getHeaderButton());

    }
    @And("the bis form opens")
    public void the_bis_form_opens() {

        Assert.assertTrue(home.bis.isElementDisplayed(home.bis.getTabBodyDiv()));

    }


    @And("the bis tab body is centered")
    public void the_bis_tab_is_centered() throws InterruptedException {

        home.bis.scrollToCenterTabBody(home.bis.getTabBodyDiv());

    }

    @And("the user fills in the bis form")
    public void the_user_fills_in_the_bis_form(){

        System.out.println("Implementing...");

    }


    @When("the user clicks on the generate bis button")
    public void the_user_clicks_on_the_generate_bis_button() throws InterruptedException {

        home.bis.clickGenerateButton(home.bis.getGenerateButton());

    }

    @Then("the bis result is visible")
    public void the_bis_result_is_visible(){

        Assert.assertTrue(home.bis.isElementDisplayed(home.bis.getResultPre()));

    }

}
