package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RizivTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/riziv-header-button");
    By tabBodyDiv = By.id("collapse-7");
    By menuSelect = By.id("/riziv-0");
    By amountInput = By.id("/riziv-1");
    By generateButton = By.id("/riziv-generate-button");
    By resultPre = By.id("riziv-text");

    public RizivTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    public WebElement getMenuSelect(){

        return webDriver.findElement(menuSelect);

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

    public void selectFromMenu(String selection){

        Select select = new Select(getMenuSelect());
        select.selectByVisibleText(selection);

        try{Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}

    }

    public void typeInputs(String amount){

        wait.until(ExpectedConditions.visibilityOfElementLocated(amountInput)).sendKeys(amount);

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
