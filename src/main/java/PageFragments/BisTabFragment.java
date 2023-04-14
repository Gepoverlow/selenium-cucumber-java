package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BisTabFragment extends BaseTabFragment {

    By tabHeaderButton = By.id("/bis-header-button");
    By tabBodyDiv = By.id("collapse-0");
    By genderNoInput = By.id("/bis-no-0");
    By generateButton = By.id("/bis-generate-button");
    By resultPre = By.id("bis-text");

    public BisTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getTabHeaderButton(){

        return webDriver.findElement(tabHeaderButton);

    }

    public WebElement getTabBodyDiv(){

        return webDriver.findElement(tabBodyDiv);

    }

    public WebElement getGenderNoInput(){

        return webDriver.findElement(genderNoInput);

    }

    public WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    public WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

    public void openTab() {

        WebElement tabHeaderButton = getTabHeaderButton();

        scrollToFooter();
        clickElement(tabHeaderButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabBodyDiv));
        wait.until(ExpectedConditions.elementToBeClickable(getGenerateButton()));
        scrollToFooter();
        clickElement(getGenderNoInput());

        try{Thread.sleep(2000);} catch(InterruptedException e) {e.printStackTrace();}

    }

}
