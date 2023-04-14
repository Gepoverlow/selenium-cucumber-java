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

    public void scrollToElement(WebElement element){

        //Doesnt work... Throws MoveTargetOutOfBoundsException: WHY??
        //actions.scrollToElement(element).perform();

        int deltaY = element.getRect().y;
        actions.scrollByAmount(0, deltaY).perform();

    }

    public void scrollToFooter(){

        //Doesnt work... Throws MoveTargetOutOfBoundsException: WHY??
        //actions.scrollToElement(webDriver.findElement(By.id("footer"))).perform();

        int deltaY = webDriver.findElement(By.id("footer")).getRect().y;
        actions.scrollByAmount(0, deltaY).perform();

    }

    public void clickElement(WebElement element) {

        // If element is out of the viewport, it will throw ElementClickInterceptedException
        System.out.println(element.getLocation());
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public boolean isElementDisplayed(WebElement element){

        return element.isDisplayed();

    }

}
