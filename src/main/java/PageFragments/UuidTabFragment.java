package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UuidTabFragment extends BaseTabFragment {

    By headerButton = By.id("/uuid-header-button");
    By tabBodyDiv = By.id("collapse-9");
    By versionInput = By.id("/uuid-0");
    By generateButton = By.id("/uuid-generate-button");
    By resultPre = By.id("uuid-text");


    public UuidTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getHeaderButton(){

        return webDriver.findElement(headerButton);

    }

    public WebElement getTabBodyDiv(){

        return webDriver.findElement(tabBodyDiv);

    }

    public WebElement getVersionInput(){

        return webDriver.findElement(versionInput);

    }

    public WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    public WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

    public void openTab() {

        WebElement headerButton = getHeaderButton();

        scrollToElement(headerButton);
        clickElement(headerButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabBodyDiv));
        wait.until(ExpectedConditions.elementToBeClickable(getGenerateButton()));
        scrollToElement(getVersionInput());

    }

}
