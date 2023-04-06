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

        return driver.findElement(headerButton);

    }

    public WebElement getTabBodyDiv(){

        return driver.findElement(tabBodyDiv);

    }

    public WebElement getGenerateButton(){

        return driver.findElement(generateButton);

    }

    public WebElement getResultPre(){

        return driver.findElement(resultPre);

    }

}
