package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TitleFragment {

    WebDriver webDriver;

    By titleSearch = By.id("title");

    By titleHeader = By.xpath("/html/body/app-root/app-home/div[1]/div[1]/h1");

    public TitleFragment(WebDriver driver){

        webDriver = driver;

    }

    public WebElement getTitleSearch(){

        return webDriver.findElement(titleSearch);

    }

    public WebElement getTitleHeader(){

        return webDriver.findElement(titleHeader);

    }

    public boolean isTitleSearchDisplayed(){

        return getTitleSearch().isDisplayed();

    }

    public boolean isTitleHeaderDisplayed(){

        return getTitleHeader().isDisplayed();

    }

    public boolean isTitleDisplayed(){

        return isTitleHeaderDisplayed() && isTitleSearchDisplayed();

    }

}
