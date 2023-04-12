package PageFragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTabFragment {

    WebDriver webDriver;
    Actions actions;
    WebDriverWait wait;


    public BaseTabFragment(WebDriver driver){

        webDriver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public void scrollToElement(WebElement element){

        int deltaY = element.getRect().y;
        actions.scrollByAmount(0, deltaY).perform();

    }

    public void moveToElement(WebElement element) {

        actions.moveToElement(element).perform();

    }

    public void clickElement(WebElement element) {

        element.click();

    }

    public boolean isElementDisplayed(WebElement element){

        return element.isDisplayed();

    }

}
