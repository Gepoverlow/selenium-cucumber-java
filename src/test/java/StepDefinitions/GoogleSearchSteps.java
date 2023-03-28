package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchSteps {

    WebDriver driver;
    ChromeOptions options;

    @Given("browser is open")
    public void browserIsOpen() {
        WebDriverManager.chromedriver().setup();

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }
    @And("user is on search page")
    public void userIsOnSearchPage() {
        driver.get("https://google.com");
        driver.findElement(By.id("W0wltc")).click();
    }
    @When("user enters a text in search box")
    public void userEntersATextInSearchBox() {
        driver.findElement(By.name("q")).sendKeys("Reddit");
    }
    @And("hits enter")
    public void hitsEnter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("user is navigated to results page")
    public void userIsNavigatedToResultsPage() {
        driver.getPageSource().contains("Reddit - Dive into anything");

        driver.close();
        driver.quit();
    }

}
