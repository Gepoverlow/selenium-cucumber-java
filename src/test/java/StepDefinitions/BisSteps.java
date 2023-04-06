package StepDefinitions;

import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BisSteps {

    TestContext testContext;
    HomePage homePage;

    public BisSteps(TestContext context){

        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();

    }
    @And("the user scrolls to the bis tab")
    public void the_user_scrolls_to_the_bis_tab() throws InterruptedException {

        homePage.bis.scrollToTabHeader(homePage.bis.getHeaderButton());

    }
    @And("the user clicks on the bis header button")
    public void the_user_clicks_on_the_bis_header_button() throws InterruptedException {

        homePage.bis.clickTabHeader(homePage.bis.getHeaderButton());

    }
    @And("the bis form opens")
    public void the_bis_form_opens() {

        Assert.assertTrue(homePage.bis.isElementDisplayed(homePage.bis.getTabBodyDiv()));

    }


    @And("the bis tab body is centered")
    public void the_bis_tab_is_centered() throws InterruptedException {

        homePage.bis.scrollToCenterTabBody(homePage.bis.getTabBodyDiv());

    }

    @And("the user fills in the bis form")
    public void the_user_fills_in_the_bis_form(){

        System.out.println("Implementing...");

    }


    @When("the user clicks on the generate bis button")
    public void the_user_clicks_on_the_generate_bis_button() throws InterruptedException {

        homePage.bis.clickGenerateButton(homePage.bis.getGenerateButton());

    }

    @Then("the bis result is visible")
    public void the_bis_result_is_visible(){

        Assert.assertTrue(homePage.bis.isElementDisplayed(homePage.bis.getResultPre()));

    }

}
