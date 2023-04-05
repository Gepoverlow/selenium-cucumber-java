package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UuidPageFragment {

    WebDriver driver;
    JavascriptExecutor jse;
    WebDriverWait wait;

    By headerButton = By.id("/uuid-header-button");
    By tabBodyDiv = By.id("collapse-9");
    By generateButton = By.id("/uuid-generate-button");
    By resultPre = By.id("uuid-text");


    public UuidPageFragment(WebDriver driver){

        this.driver = driver;
        this.jse = (JavascriptExecutor)driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void scrollToTabHeader() throws InterruptedException {

        WebElement tabHeader = driver.findElement(headerButton);
        jse.executeScript("arguments[0].scrollIntoView(true);", tabHeader);
        Thread.sleep(500);

    }

    public void clickTabHeader() throws InterruptedException {

        driver.findElement(headerButton).click();
        Thread.sleep(1000);

    }

    public void scrollToCenterTabBody() throws InterruptedException {

        WebElement tabBody = driver.findElement(tabBodyDiv);
        jse.executeScript("arguments[0].scrollIntoView(true);", tabBody);
        Thread.sleep(500);

    }

    public void clickGenerateButton() throws InterruptedException {

        driver.findElement(generateButton).click();
        Thread.sleep(1000);

    }

    public Boolean isTabBodyDisplayed(){

        return driver.findElement(tabBodyDiv).isDisplayed();

    }

    public Boolean isResultDisplayed(){

        return driver.findElement(resultPre).isDisplayed();

    }
}
