package Utilities;

import Managers.DriverManager;
import Managers.PageObjectManager;
import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class TestContext {

    private final DriverManager driverManager;
    private final PageObjectManager pageObjectManager;

    public TestContext() {

        driverManager = new DriverManager();
        pageObjectManager = new PageObjectManager();

    }

    public HomePage getHomePage(){

        if (pageObjectManager.getHomePage() == null) pageObjectManager.setHomePage(new HomePage(driverManager.getWebDriver()));
        return pageObjectManager.getHomePage();

    }

    public WebDriver getDriver(){

        if (driverManager.getWebDriver() == null) driverManager.setWebDriver(driverManager.createDriver());
        return driverManager.getWebDriver();

    }

    public void closeDriver(){

        driverManager.getWebDriver().close();
        driverManager.getWebDriver().quit();

    }

}
