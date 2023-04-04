package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AllTabsSteps {

    WebDriver driver;
    ChromeOptions options;
    HomePage home;
    private String targetTab;

    @Given("the browser is open")
    public void theBrowserIsOpen() {

        WebDriverManager.chromedriver().setup();

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

    }
    @And("^the user is on the home page in search of \"(.*)\"$")
    public void theUserIsOnTheHomePage(String tabName) {

        home = new HomePage(driver);
        driver.get("https://d2r3v7evrrggno.cloudfront.net/");

        targetTab = tabName;
        home.setUpScrollEventListener();

    }

    @And("the user scrolls to the tab header")
    public void theUserScrollsToTheTabHeader() {

        home.scrollToTabHeader(targetTab);

    }

    @When("the user clicks on the tab header")
    public void theUserClicksOnTheTabHeader() {

        home.clickTabHeader(targetTab);

    }

    @And("the tab opens to show details")
    public void theTabOpensToShowDetails(){

       Assert.assertTrue(home.isTabBodyVisible(targetTab));

    }

    @And("the tab is centered")
    public void theTabIsCentered() {

        home.scrollToCenterTabBody(targetTab);

    }

    @And("the user clicks on generate")
    public void theUserClicksOnGenerate() {

        home.clickGenerateButton(targetTab);

    }

    @Then("the results element is visible")
    public void theResultsAreShown() {

        Assert.assertTrue(home.isResultVisible(targetTab));

        driver.close();
        driver.quit();

    }

}
