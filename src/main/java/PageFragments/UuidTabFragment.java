package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UuidTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/uuid-header-button");
    By tabBodyDiv = By.id("collapse-9");
    By versionInput = By.id("/uuid-0");
    By amountInput = By.id("/uuid-1");
    By generateButton = By.id("/uuid-generate-button");
    By resultPre = By.id("uuid-text");


    public UuidTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    public WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    public WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

    public void openTab() {

        WebElement tabHeaderButton = getTabHeaderButton();

        openTabFromElement(tabHeaderButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabBodyDiv));
        wait.until(ExpectedConditions.elementToBeClickable(getGenerateButton()));
        centerTabFromElement(tabHeaderButton);

    }

    public void typeInputs(String date, String amount){

        wait.until(ExpectedConditions.visibilityOfElementLocated(versionInput)).sendKeys(date);
        wait.until(ExpectedConditions.visibilityOfElementLocated(amountInput)).sendKeys(amount);

    }

    public void clickGenerateButton(){

        WebElement generateButton = getGenerateButton();

        clickElement(generateButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultPre));

    }

    public boolean isResultDisplayed(){

        WebElement resultPre = getResultPre();

        return resultPre.isDisplayed();

    }

}
