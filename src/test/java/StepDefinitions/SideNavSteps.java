package StepDefinitions;

import Implementations.TabFragment;
import PageFragments.*;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SideNavSteps {

    TestContext testContext;
    HomePage homePage;
    SideNavFragment sideNav;
    TabFragment searchedTabFragment;

    public SideNavSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }

    @When("the user hovers over the side nav")
    public void theUserHoversOverTheSideNav() {

        sideNav = homePage.hoverOverSideNav();

    }

    @And("the user clicks on the bis menu button")
    public void theUserClicksOnTheBisMenuButton() {

        searchedTabFragment = sideNav.clickBisMenuButton();

    }

    @And("the user clicks on the insz menu button")
    public void theUserClicksOnTheInszMenuButton() {

        searchedTabFragment = sideNav.clickInszMenuButton();

    }

    @And("the user clicks on the kbo menu button")
    public void theUserClicksOnTheKboMenuButton() {

        searchedTabFragment = sideNav.clickKboMenuButton();

    }

    @And("the user clicks on the lorem menu button")
    public void theUserClicksOnTheLoremMenuButton() {

        searchedTabFragment = sideNav.clickLoremMenuButton();

    }

    @And("the user clicks on the nihii menu button")
    public void theUserClicksOnTheNihiiMenuButton() {

        searchedTabFragment = sideNav.clickNihiiMenuButton();

    }

    @And("the user clicks on the plates menu button")
    public void theUserClicksOnThePlatesMenuButton() {

        searchedTabFragment = sideNav.clickPlatesMenuButton();

    }

    @And("the user clicks on the polis menu button")
    public void theUserClicksOnThePolisMenuButton() {

        searchedTabFragment = sideNav.clickPolisMenuButton();

    }

    @And("the user clicks on the riziv menu button")
    public void theUserClicksOnTheRizivMenuButton() {

        searchedTabFragment = sideNav.clickRizivMenuButton();

    }

    @And("the user clicks on the telephone menu button")
    public void theUserClicksOnTheTelephoneMenuButton() {

        searchedTabFragment = sideNav.clickTelephoneMenuButton();

    }

    @And("the user clicks on the uuid menu button")
    public void theUserClicksOnTheUuidMenuButton() {

        searchedTabFragment = sideNav.clickUuidMenuButton();

    }

    @Then("the search input contains {string}")
    public void theSearchInputContains(String expectedValue) {

        Assert.assertEquals(homePage.title.getSearchInputValue(), expectedValue);

    }
    @And("the tab is displayed and open")
    public void theBisTabIsDisplayed_and_open() {

        Assert.assertTrue(searchedTabFragment.isTabBodyVisible());

    }

}
