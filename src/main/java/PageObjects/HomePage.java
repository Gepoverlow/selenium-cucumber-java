package PageObjects;

import PageFragments.BisTabFragment;
import PageFragments.NavBarFragment;
import PageFragments.TitleFragment;
import PageFragments.UuidTabFragment;
import org.openqa.selenium.WebDriver;


public class HomePage {

    public NavBarFragment nav;
    public TitleFragment title;
    public BisTabFragment bis;
    public UuidTabFragment uuid;


    public HomePage(WebDriver driver){

        nav = new NavBarFragment(driver);
        title = new TitleFragment(driver);
        bis = new BisTabFragment(driver);
        uuid = new UuidTabFragment(driver);

    }

    public void openBisTab(){

        System.out.println("the user opens the bis tab");

    }

    public void fillInBisFields(){

        System.out.println("the user fills in the fields needed to generate bis data");

    }

    public void clickGenerateBisButton(){

        System.out.println("the user clicks on the generate bis button");

    }

    public void verifyResultIsVisible(){

        System.out.println("the user clicks on the generate bis button");

    }

}
