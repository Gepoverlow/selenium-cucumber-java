package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BisTabFragment extends BaseTabFragment {

    By headerButton = By.id("/bis-header-button");
    By tabBodyDiv = By.id("collapse-0");
    By genderYesInput = By.id("/bis-yes-0");
    By generateButton = By.id("/bis-generate-button");
    By resultPre = By.id("bis-text");

    public BisTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getHeaderButton(){

        return webDriver.findElement(headerButton);

    }

    public WebElement getTabBodyDiv(){

        return webDriver.findElement(tabBodyDiv);

    }

    public WebElement getGenderYesInput(){

        return webDriver.findElement(genderYesInput);

    }

    public WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    public WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

    public void openTab() {

        WebElement headerButton = getHeaderButton();

        scrollToElement(headerButton);
        clickElement(headerButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabBodyDiv));
        wait.until(ExpectedConditions.elementToBeClickable(getGenerateButton()));
        scrollToElement(getGenderYesInput());

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
