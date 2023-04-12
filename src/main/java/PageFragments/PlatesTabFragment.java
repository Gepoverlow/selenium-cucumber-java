package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlatesTabFragment extends BaseTabFragment {

    By headerButton = By.id("/plates-header-button");
    By tabBodyDiv = By.id("collapse-5");
    By selectMenuInput = By.id("/plates-0");
    By generateButton = By.id("/plates-generate-button");
    By resultPre = By.id("plates-text");


    public PlatesTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getHeaderButton(){

        return webDriver.findElement(headerButton);

    }

    public WebElement getTabBodyDiv(){

        return webDriver.findElement(tabBodyDiv);

    }

    public WebElement getSelectMenuInput(){

        return webDriver.findElement(selectMenuInput);

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
        scrollToElement(getSelectMenuInput());

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
