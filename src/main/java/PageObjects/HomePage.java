package PageObjects;

import PageFragments.BisPageFragment;
import PageFragments.UuidPageFragment;
import org.openqa.selenium.WebDriver;


public class HomePage {

    public BisPageFragment bis;
    public UuidPageFragment uuid;


    public HomePage(WebDriver driver){

        this.bis = new BisPageFragment(driver);
        this.uuid = new UuidPageFragment(driver);

    }

}
