package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class NihiiTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/nihii-header-button");
    By tabBodyDiv = By.id("collapse-4");
    By menuSelect = By.id("/nihii-0");
    By versionInput = By.id("/nihii-1");
    By amountInput = By.id("/nihii-2");
    By generateButton = By.id("/nihii-generate-button");
    By resultPre = By.id("nihii-text");

    public NihiiTabFragment(WebDriver driver){

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

    }

    public void selectFromMenu(String selection){

        Select select = new Select(getMenuSelect());
        select.selectByVisibleText(selection);

    }

    public void typeInputs(String version, String amount){

        wait.until(ExpectedConditions.visibilityOfElementLocated(versionInput)).sendKeys(version);
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
