package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TitleFragment extends BaseFragment {

    By titleHeader = By.xpath("/html/body/app-root/app-home/div[1]/div[1]/h1");
    By searchInput = By.id("search");

    public TitleFragment(WebDriver driver){

        super(driver);

    }

    public boolean isTitleDisplayed(){

        return isTitleHeaderDisplayed() && isTitleSearchDisplayed();

    }

    public String getSearchInputValue(){

        return getSearchInput().getAttribute("value");

    }

    private WebElement getSearchInput(){

        return webDriver.findElement(searchInput);

    }

    private WebElement getTitleHeader(){

        return webDriver.findElement(titleHeader);

    }

    private boolean isTitleSearchDisplayed(){

        return getSearchInput().isDisplayed();

    }

    private boolean isTitleHeaderDisplayed(){

        return getTitleHeader().isDisplayed();

    }

}
