package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InszTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/insz-header-button");
    By tabBodyDiv = By.id("collapse-1");
    By dateInput = By.id("/insz-0");
    By amountInput = By.id("/insz-1");
    By generateButton = By.id("/insz-generate-button");
    By resultPre = By.id("insz-text");

    public InszTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    public WebElement getTabBodyDiv(){

        return webDriver.findElement(tabBodyDiv);

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

        wait.until(ExpectedConditions.visibilityOfElementLocated(dateInput)).sendKeys(date);
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
