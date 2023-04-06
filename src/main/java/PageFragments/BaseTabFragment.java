package PageFragments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseTabFragment {

    WebDriver webDriver;
    JavascriptExecutor jse;

    public BaseTabFragment(WebDriver driver){

        webDriver = driver;
        jse = (JavascriptExecutor) webDriver;

    }

    public void scrollToTabHeader(WebElement tabHeader) throws InterruptedException {

        jse.executeScript("arguments[0].scrollIntoView(true);", tabHeader);
        Thread.sleep(500);

    }

    public void clickTabHeader(WebElement tabHeader) throws InterruptedException {

        tabHeader.click();
        Thread.sleep(1000);

    }

    public void scrollToCenterTabBody(WebElement tabBody) throws InterruptedException {

        jse.executeScript("arguments[0].scrollIntoView(true);", tabBody);
        Thread.sleep(500);

    }

    public void clickGenerateButton(WebElement generateButton) throws InterruptedException {

        generateButton.click();
        Thread.sleep(1000);

    }

    public boolean isElementDisplayed(WebElement element){

        return element.isDisplayed();

    }

}
