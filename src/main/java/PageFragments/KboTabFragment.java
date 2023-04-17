package PageFragments;

import Implementations.TabFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KboTabFragment extends BaseTabFragment implements TabFragment {

    By tabHeaderButton = By.id("/kbo-header-button");
    By tabBodyDiv = By.cssSelector("[aria-labelledby=\"tab-/kbo\"]");
    By versionInput = By.id("/kbo-0");
    By amountInput = By.id("/kbo-1");
    By generateButton = By.id("/kbo-generate-button");
    By resultPre = By.id("kbo-text");

    public KboTabFragment(WebDriver driver){

        super(driver);

    }

    public void openTab() {

        WebElement tabHeaderButton = getTabHeaderButton();

        openTabFromElement(tabHeaderButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabBodyDiv));
        wait.until(ExpectedConditions.elementToBeClickable(getGenerateButton()));
        centerTabFromElement(tabHeaderButton);

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

    public boolean isTabBodyVisible(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(tabBodyDiv)).isDisplayed();

    }

    private WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    private WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    private WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

}
