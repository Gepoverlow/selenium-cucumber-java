package PageObjects;

import PageFragments.*;
import org.openqa.selenium.WebDriver;


public class HomePage {

    public NavBarFragment nav;
    public TitleFragment title;
    public BisTabFragment bis;
    public PlatesTabFragment plates;
    public UuidTabFragment uuid;


    public HomePage(WebDriver driver){

        nav = new NavBarFragment(driver);
        title = new TitleFragment(driver);
        bis = new BisTabFragment(driver);
        plates = new PlatesTabFragment(driver);
        uuid = new UuidTabFragment(driver);

    }

    public BisTabFragment openBisTab() {

        bis.openTab();

        return bis;

    }

    public UuidTabFragment openUuidTab() {

        uuid.openTab();

        return uuid;

    }

    public PlatesTabFragment openPlatesTab() {

        plates.openTab();

        return plates;

    }


}
