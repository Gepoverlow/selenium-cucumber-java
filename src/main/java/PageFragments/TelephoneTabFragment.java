package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TelephoneTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/telephone-header-button");
    By tabBodyDiv = By.id("collapse-8");
    By menuSelect = By.id("/telephone-0");
    By generateButton = By.id("/telephone-generate-button");
    By resultPre = By.id("telephone-text");

    public TelephoneTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    public WebElement getTabBodyDiv(){

        return webDriver.findElement(tabBodyDiv);

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

    public void clickGenerateButton(){

        webDriver.findElement(generateButton).click();

        try{Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}

    }

    public boolean isResultDisplayed(){

        WebElement resultPre = getResultPre();

        return resultPre.isDisplayed();

    }

}
