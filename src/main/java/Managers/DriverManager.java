package Managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DriverManager {

    private WebDriver webDriver;
    private static String driverType;

    public DriverManager() {

        driverType = FileReaderManager.getInstance().getConfigFileReader().getDriverType();

    }

    public WebDriver createDriver() throws MalformedURLException {
        switch (driverType) {
            case "REMOTE":
                Dotenv dotenv = Dotenv.load();
                String user = dotenv.get("user");
                String key = dotenv.get("key");
                MutableCapabilities capabilities = new MutableCapabilities();
                capabilities.setCapability("browserName", "chrome");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("osVersion", "12.0");
                browserstackOptions.put("deviceName", "Samsung Galaxy S21");
                browserstackOptions.put("projectName", "DataGenProject");
                capabilities.setCapability("bstack:options", browserstackOptions);

                webDriver = new RemoteWebDriver(new URL("https://" + user + ":" + key + "@hub-cloud.browserstack.com/wd/hub/"), capabilities);
                break;
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
