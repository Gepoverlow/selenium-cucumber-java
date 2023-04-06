package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BisTabFragment extends BaseTabFragment {

    By headerButton = By.id("/bis-header-button");
    By tabBodyDiv = By.id("collapse-0");
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

    public WebElement getGenerateButton(){

        return webDriver.findElement(generateButton);

    }

    public WebElement getResultPre(){

        return webDriver.findElement(resultPre);

    }

}
