package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarFragment {

    WebDriver webDriver;

    By pageLogo = By.id("title");
    By infoButton = By.xpath("/html/body/app-root/app-navbar/nav/div/div/a");

    public NavBarFragment(WebDriver driver){

        webDriver = driver;

    }

    public WebElement getPageLogo(){

        return webDriver.findElement(pageLogo);

    }

    public WebElement getInfoButton(){

        return webDriver.findElement(infoButton);

    }

    public boolean isLogoDisplayed(){

        return getPageLogo().isDisplayed();

    }

    public boolean isInfoButtonDisplayed(){

        return getInfoButton().isDisplayed();

    }

    public boolean isNavBarDisplayed(){

        return isLogoDisplayed() && isInfoButtonDisplayed();

    }

}


