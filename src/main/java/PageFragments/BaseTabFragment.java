package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void openTabFromElement(WebElement element){

        scrollToElement(element);
        clickElement(element);

    }

    public void centerTabFromElement(WebElement element){

        scrollToTheTopFromElement(element);
        scrollToElement(element);

    }

    private void scrollToElement(WebElement element){

        //Doesnt work... Throws MoveTargetOutOfBoundsException: WHY??
        //actions.scrollToElement(element).perform();

        int deltaY = element.getRect().y;
        actions.scrollByAmount(0, deltaY).perform();

    }

    private void scrollToTheTopFromElement(WebElement element){

        int deltaY = element.getRect().y;
        actions.scrollByAmount(0, -deltaY).perform();

    }

    private void clickElement(WebElement element) {

        // If element is out of the viewport, it will throw ElementClickInterceptedException
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public boolean isElementDisplayed(WebElement element){

        return element.isDisplayed();

    }

}
