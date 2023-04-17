package PageFragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseTabFragment extends BaseFragment {

    public BaseTabFragment(WebDriver driver){

        super(driver);

    }

    protected void openTabFromElement(WebElement element){

        scrollToElement(element);
        clickElement(element);

    }

    protected void centerTabFromElement(WebElement element){

        scrollToTheTopFromElement(element);
        scrollToElement(element);

    }

    public void clickElement(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    private void scrollToElement(WebElement element){

        //Doesnt work... Throws MoveTargetOutOfBoundsException: WHY??
        //actions.scrollToElement(element).perform();

        int deltaY = element.getRect().y;
        actions.scrollByAmount(0, deltaY).perform();

    }

    private void scrollToTheTopFromElement(WebElement element){

        int deltaY = element.getRect().y;
        actions.scrollByAmount(0, -deltaY).perform();

    }

}
