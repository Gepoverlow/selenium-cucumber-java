package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UuidTabFragment extends BaseTabFragment {

    By headerButton = By.id("/uuid-header-button");
    By tabBodyDiv = By.id("collapse-9");
    By generateButton = By.id("/uuid-generate-button");
    By resultPre = By.id("uuid-text");


    public UuidTabFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getHeaderButton(){

        return webDriver.findElement(headerButton);

    }

    public WebElement getTabBodyDiv(){

        return webDriver.findElement(tabBodyDiv);

    }

    public WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    public WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

}
