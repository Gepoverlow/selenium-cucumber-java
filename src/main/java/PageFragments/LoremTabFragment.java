package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoremTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/lorem-header-button");
    By tabBodyDiv = By.id("collapse-3");
    By lettersOnlyYesInput = By.id("/lorem-yes-0");
    By lettersOnlyNoInput = By.id("/lorem-no-0");
    By lengthInput = By.id("/lorem-1");
    By generateButton = By.id("/lorem-generate-button");
    By resultPre = By.id("lorem-text");

    public LoremTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    public WebElement getLettersOnlyInput(String yesOrNo){

        switch (yesOrNo){
            case "no":
                return webDriver.findElement(lettersOnlyNoInput);
            default:
            case  "yes":
                return webDriver.findElement(lettersOnlyYesInput);
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

        try{Thread.sleep(2000);} catch(InterruptedException e) {e.printStackTrace();}

    }

    public void clickInputs(String lettersOnly){

        wait.until(ExpectedConditions.elementToBeClickable(getLettersOnlyInput(lettersOnly))).click();

        try{Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}

    }

    public void typeInputs(String length){

        wait.until(ExpectedConditions.visibilityOfElementLocated(lengthInput)).sendKeys(length);

        try{Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}

    }

    public void clickGenerateButton(){

        webDriver.findElement(generateButton).click();

        try{Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}

    }

    public boolean isResultDisplayed(){

        WebElement resultPre = getResultPre();

        return resultPre.isDisplayed();

    }

}
