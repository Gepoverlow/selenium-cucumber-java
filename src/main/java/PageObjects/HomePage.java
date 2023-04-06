package PageObjects;

import PageFragments.BisTabFragment;
import PageFragments.UuidTabFragment;
import org.openqa.selenium.WebDriver;


public class HomePage {

    public BisTabFragment bis;
    public UuidTabFragment uuid;


    public HomePage(WebDriver driver){

        this.bis = new BisTabFragment(driver);
        this.uuid = new UuidTabFragment(driver);

    }

}
