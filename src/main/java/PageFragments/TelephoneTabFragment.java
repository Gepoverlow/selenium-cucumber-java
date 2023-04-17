package PageFragments;

import Implementations.TabFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TelephoneTabFragment extends BaseTabFragment implements TabFragment {

    By tabHeaderButton = By.id("/telephone-header-button");
    By tabBodyDiv = By.cssSelector("[aria-labelledby=\"tab-/telephone\"]");
    By menuSelect = By.id("/telephone-0");
    By amountInput = By.id("/telephone-1");
    By generateButton = By.id("/telephone-generate-button");
    By resultPre = By.id("telephone-text");

    public TelephoneTabFragment(WebDriver driver){

        super(driver);

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

    public void typeInputs(String amount){

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

    private WebElement getMenuSelect(){

        return webDriver.findElement(menuSelect);

    }

    private WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    private WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

}
