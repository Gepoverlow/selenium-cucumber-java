package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BisPageFragment {

    WebDriver driver;
    JavascriptExecutor jse;

    By headerButton = By.id("/bis-header-button");
    By tabBodyDiv = By.id("collapse-0");
    By generateButton = By.id("/bis-generate-button");

    public BisPageFragment(WebDriver driver){

        this.driver = driver;
        this.jse = (JavascriptExecutor)driver;

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

}
