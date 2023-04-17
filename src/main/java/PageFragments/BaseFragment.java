package PageFragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFragment {

    WebDriver webDriver;
    Actions actions;
    WebDriverWait wait;

    public BaseFragment(WebDriver driver){

        webDriver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

}
