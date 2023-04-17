package PageFragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SideNavFragment extends BaseFragment {

    By sideNavBody = By.xpath("/html/body/app-root/app-home/app-sidenav/div");
    By bisMenuButton = By.id("bis-menu-button");
    By inszMenuButton = By.id("insz-menu-button");
    By kboMenuButton = By.id("kbo-menu-button");
    By loremMenuButton = By.id("lorem-menu-button");
    By nihiiMenuButton = By.id("nihii-menu-button");
    By platesMenuButton = By.id("plates-menu-button");
    By polisMenuButton = By.id("polis-menu-button");
    By rizivMenuButton = By.id("riziv-menu-button");
    By telephoneMenuButton = By.id("telephone-menu-button");
    By uuidMenuButton = By.id("uuid-menu-button");

    public SideNavFragment(WebDriver driver){

        super(driver);

    }

    public WebElement getSideNavBody(){

        return webDriver.findElement(sideNavBody);

    }

    public WebElement getBisMenuButton(){

        return webDriver.findElement(bisMenuButton);

    }
    public WebElement getInszMenuButton(){

        return webDriver.findElement(inszMenuButton);

    }
    public WebElement getKboMenuButton(){

        return webDriver.findElement(kboMenuButton);

    }
    public WebElement getLoremMenuButton(){

        return webDriver.findElement(loremMenuButton);

    }
    public WebElement getNihiiMenuButton(){

        return webDriver.findElement(nihiiMenuButton);

    }
    public WebElement getPlatesMenuButton(){

        return webDriver.findElement(platesMenuButton);

    }
    public WebElement getPolisMenuButton(){

        return webDriver.findElement(polisMenuButton);

    }
    public WebElement getRizivMenuButton(){

        return webDriver.findElement(rizivMenuButton);

    }
    public WebElement getTelephoneMenuButton(){

        return webDriver.findElement(telephoneMenuButton);

    }
    public WebElement getUuidMenuButton(){

        return webDriver.findElement(uuidMenuButton);

    }

    public void hoverOverSideNav(){

        actions.moveToElement(getSideNavBody()).perform();

    }

    public BisTabFragment clickBisMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(bisMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getBisMenuButton())).click();

        return new BisTabFragment(webDriver);

    }

    public InszTabFragment clickInszMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(inszMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getInszMenuButton())).click();

        return new InszTabFragment(webDriver);

    }

    public KboTabFragment clickKboMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(kboMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getKboMenuButton())).click();

        return new KboTabFragment(webDriver);

    }

    public LoremTabFragment clickLoremMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(loremMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getLoremMenuButton())).click();

        return new LoremTabFragment(webDriver);

    }

    public NihiiTabFragment clickNihiiMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(nihiiMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getNihiiMenuButton())).click();

        return new NihiiTabFragment(webDriver);

    }

    public PlatesTabFragment clickPlatesMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(platesMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getPlatesMenuButton())).click();

        return new PlatesTabFragment(webDriver);

    }

    public PolisTabFragment clickPolisMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(polisMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getPolisMenuButton())).click();

        return new PolisTabFragment(webDriver);

    }

    public RizivTabFragment clickRizivMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(rizivMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getRizivMenuButton())).click();

        return new RizivTabFragment(webDriver);

    }

    public TelephoneTabFragment clickTelephoneMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(telephoneMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getTelephoneMenuButton())).click();

        return new TelephoneTabFragment(webDriver);

    }

    public UuidTabFragment clickUuidMenuButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(uuidMenuButton));
        wait.until(ExpectedConditions.elementToBeClickable(getUuidMenuButton())).click();

        return new UuidTabFragment(webDriver);

    }

}
