package StepDefinitions;

import Enums.Tabs;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BisTabSteps {

    WebDriver driver;
    ChromeOptions options;
    HomePage home;

    private final String targetTab = String.valueOf(Tabs.TELEPHONE);

    @Given("the browser is open")
    public void theBrowserIsOpen() {

        WebDriverManager.chromedriver().setup();

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

    }
    @And("the user is on the home page")
    public void theUserIsOnTheHomePage() {

        home = new HomePage(driver);
        driver.get("https://d2r3v7evrrggno.cloudfront.net/");

    }

    @And("the user scrolls to the bis tab")
    public void theUserScrolsToTheBisTab() {

        home.scrollToTab(targetTab);

    }


    @When("the user clicks on the bis tab")
    public void theUserClicksOnTheBisTab() {

        home.clickTab(targetTab);

    }

    @And("the tab opens to show details")
    public void theTabOpensToShowDetails(){

        System.out.println("implementing...");

    }

    @And("the tab is centered")
    public void theTabIsCentered() {

        home.scrollToTab(targetTab);

    }

    @And("the user fills in data")
    public void theUserFillsInData(){

        System.out.println("Implementing...");

    }

    @And("the user clicks on generate")
    public void theUserClicksOnGenerate() throws InterruptedException {

        home.clickGenerateButton(targetTab);

    }

    @Then("the results are shown")
    public void theResultsAreShown() {

        System.out.println("Implementing...");
        driver.close();
        driver.quit();

    }

}
