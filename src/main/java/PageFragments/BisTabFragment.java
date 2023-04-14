package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BisTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/bis-header-button");
    By tabBodyDiv = By.id("collapse-0");
    By genderYesInput = By.id("/bis-yes-0");
    By genderNoInput = By.id("/bis-no-0");
    By dobYesInput = By.id("/bis-yes-1");
    By dobNoInput = By.id("/bis-no-1");
    By dateInput = By.id("/bis-2");
    By amountInput = By.id("/bis-3");
    By generateButton = By.id("/bis-generate-button");
    By resultPre = By.id("bis-text");

    public BisTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    public WebElement getGenderInput(String yesOrNo){

        switch (yesOrNo){
            case "no":
                return webDriver.findElement(genderNoInput);
            default:
            case  "yes":
                return webDriver.findElement(genderYesInput);
        }
    }

    public WebElement getDobInput(String yesOrNo){

        switch (yesOrNo){
            case "no":
                return webDriver.findElement(dobNoInput);
            default:
            case  "yes":
                return webDriver.findElement(dobYesInput);
        }

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

    public void clickInputs(String genderKnown, String dobKnown){

        wait.until(ExpectedConditions.elementToBeClickable(getGenderInput(genderKnown))).click();
        wait.until(ExpectedConditions.elementToBeClickable(getDobInput(dobKnown))).click();

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
