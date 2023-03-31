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

    public void clickTab(String tabName) {

        clickWithJavascript(getTabHeaderButton(tabName));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("/" + tabName + "-generate-button")));

    }


    public void scrollToTabHeader(String tabName) {

        scrollElementIntoView(getTabHeaderButton(tabName));

    }

    public WebElement getTabHeaderButton(String tabName){

        return driver.findElement(By.id("/" + tabName + "-header-button"));

    }

    public WebElement getTabGenerateButton(String tabName){

        return driver.findElement(By.id("/" + tabName + "-generate-button"));

    }


    public void scrollElementIntoView(WebElement element) {

        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        waitForJavascriptToFinishScrolling();

    }

    public void clickWithJavascript(WebElement headerButton) {

        jse.executeScript("arguments[0].click()", headerButton);

    }

    public void clickGenerateButton(String tabName) {

        wait.until(ExpectedConditions.elementToBeClickable(getTabGenerateButton(tabName))).click();

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

    public void waitForJavascriptToFinishScrolling() {
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return (Boolean) jse.executeScript("return window.isScrolling === false");
            }
        });
    }
}
