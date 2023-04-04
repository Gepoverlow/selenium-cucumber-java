package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    JavascriptExecutor jse;
    WebDriverWait wait;
    By searchInput = By.id("search");
    By infoButton = By.linkText("Generator information");
    By goUpButton = By.id("go-up");
    By footerDotsButton = By.id("footer-dots");

    public HomePage(WebDriver driver){

        this.driver = driver;
        this.jse = (JavascriptExecutor)driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void setUpScrollEventListener(){

        jse.executeScript("""
                var scrollTimeout;
                window.isScrolling = false;
                addEventListener('scroll', function(e) {
                    window.isScrolling = true;
                    clearTimeout(scrollTimeout);
                    scrollTimeout = setTimeout(function() {
                        window.isScrolling = false;
                    }, 100);
                });
                """);

    }

    public WebElement getTabHeaderElement(String tabName){

        return driver.findElement(By.id("/" + tabName + "-header-button"));

    }

    public WebElement getTabBodyElement(String tabName) {

        return driver.findElement(By.cssSelector(".accordion-collapse[aria-labelledby='tab-/" + tabName + "']"));

    }

    public WebElement getTabGenerateElement(String tabName){

        return driver.findElement(By.id("/" + tabName + "-generate-button"));

    }

    public WebElement getTabResultElement(String tabName){

        return driver.findElement(By.id(tabName + "-text"));

    }

    public WebElement getSpecificFormElement(String tabName, String inputId) {

        return driver.findElement(By.id(tabName + "-" + inputId));

    }

    public void clickSpecificFormElement(String tabName, String inputId) {

        getSpecificFormElement(tabName, inputId).click();

    }

    public void clickTabHeader(String tabName) {

        clickElementWithJavascript(getTabHeaderElement(tabName));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("/" + tabName + "-generate-button")));

    }


    public void scrollToTabHeader(String tabName) {

        scrollToElementWithJavascript(getTabHeaderElement(tabName));

    }

    public void scrollToCenterTabBody(String tabName) {

        scrollToElementWithJavascript(getTabBodyElement(tabName));

    }

    public void clickGenerateButton(String tabName) {

        wait.until(ExpectedConditions.elementToBeClickable(getTabGenerateElement(tabName))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(tabName + "-text")));
    }

    public void scrollToElementWithJavascript(WebElement element) {

        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        waitForJavascriptToFinishScrolling();

    }

    public void clickElementWithJavascript(WebElement element) {

        jse.executeScript("arguments[0].click()", element);

    }

    public Boolean isTabBodyVisible(String tabName){

        return isElementVisible(getTabBodyElement(tabName));

    }

    public Boolean isResultVisible(String tabName){

        return isElementVisible(getTabResultElement(tabName));

    }

    public Boolean isElementVisible(WebElement element){

        return element.isDisplayed();

    }

    public void waitForJavascriptToFinishScrolling() {
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return (Boolean) jse.executeScript("return window.isScrolling === false");
            }
        });
    }
}
