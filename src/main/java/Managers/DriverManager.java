package Managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

    private WebDriver webDriver;
    private static String driverType;

    public DriverManager() {

        driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();

    }

    public WebDriver createDriver() {
        switch (driverType) {
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case "SAFARI":
                webDriver = new SafariDriver();
                break;
            case "CHROME":
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                webDriver = new ChromeDriver(chromeOptions);
        }

        return webDriver;

    }

    public WebDriver getWebDriver() {

        return webDriver;

    }

    public void setWebDriver(WebDriver newWebDriver){

        webDriver = newWebDriver;

    }

}
