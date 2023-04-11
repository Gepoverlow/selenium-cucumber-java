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
    public void the_user_is_on_the_home_page(){

        Assert.assertTrue(homePage.nav.isNavBarDisplayed());
        Assert.assertTrue(homePage.title.isTitleDisplayed());

    }

}
