package StepDefinitions;

import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class BackgroundSteps {

    TestContext testContext;
    HomePage homePage;

    public BackgroundSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }

    @Given("the user is on the home page")
    public void theUseIsOnTheHomePage(){

        Assert.assertTrue(homePage.nav.isNavBarDisplayed());
        Assert.assertTrue(homePage.title.isTitleDisplayed());

    }

}
