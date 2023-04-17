package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarFragment extends BaseFragment {
    By pageLogo = By.id("title");
    By infoButton = By.xpath("/html/body/app-root/app-navbar/nav/div/div/a");

    public NavBarFragment(WebDriver driver){

        super(driver);

    }

    public boolean isNavBarDisplayed(){

        return isLogoDisplayed() && isInfoButtonDisplayed();

    }

    private WebElement getPageLogo(){

        return webDriver.findElement(pageLogo);

    }

    private WebElement getInfoButton(){

        return webDriver.findElement(infoButton);

    }

    private boolean isLogoDisplayed(){

        return getPageLogo().isDisplayed();

    }

    private boolean isInfoButtonDisplayed(){

        return getInfoButton().isDisplayed();

    }

}


