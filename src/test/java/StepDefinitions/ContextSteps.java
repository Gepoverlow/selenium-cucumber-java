package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContextSteps {

    private WebDriver driver;
    private ChromeOptions options;
    private HomePage home;

    @Before
    public void setUp(){

        System.out.println("Setting up...");
        WebDriverManager.chromedriver().setup();

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        home = new HomePage(driver);

    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage getHome(){ return home; }

}
