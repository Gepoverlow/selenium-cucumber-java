package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage {

    WebDriver driver;
    JavascriptExecutor jse;
    WebDriverWait wait;
    By searchInput = By.id("search");
    By infoBtn = By.linkText("Generator information");
    By goUpBtn = By.id("go-up");
    By footerDotsBtn = By.id("footer-dots");


    public HomePage(WebDriver driver){

        this.driver = driver;
        this.jse = (JavascriptExecutor)driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void clickTab(String tabName) {

        WebElement headerButton = getTabHeaderButton(tabName);
        WebElement generateButton = getTabGenerateButton(tabName);

        clickWithJavascript(headerButton);

        wait.until(ExpectedConditions.elementToBeClickable(generateButton));

    }

    public void scrollToTabHeader(String tabName) {

        WebElement headerButton = getTabHeaderButton(tabName);

        scrollElementIntoView(headerButton);

    }

    public WebElement getTabHeaderButton(String tabName){

        return driver.findElement(By.id("/" + tabName + "-header-button"));

    }

    public WebElement getTabGenerateButton(String tabName){

        return driver.findElement(By.id("/" + tabName + "-generate-button"));

    }


    public void scrollElementIntoView(WebElement element){

        jse.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void clickWithJavascript(WebElement headerButton) {

        jse.executeScript("arguments[0].click()", headerButton);

    }

    public void clickGenerateButton(String tabName) throws InterruptedException {

        WebElement generateButton = getTabGenerateButton(tabName);
        generateButton.click();

        Thread.sleep(5000);

    }

}
