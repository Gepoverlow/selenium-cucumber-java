package PageObjects;

import PageFragments.*;
import org.openqa.selenium.WebDriver;


public class HomePage {
    public NavBarFragment nav;
    public TitleFragment title;
    public BisTabFragment bis;
    public InszTabFragment insz;
    public KboTabFragment kbo;
    public LoremTabFragment lorem;
    public NihiiTabFragment nihii;
    public PlatesTabFragment plates;
    public PolisTabFragment polis;
    public RizivTabFragment riziv;
    public TelephoneTabFragment telephone;
    public UuidTabFragment uuid;


    public HomePage(WebDriver driver){

        nav = new NavBarFragment(driver);
        title = new TitleFragment(driver);
        bis = new BisTabFragment(driver);
        insz = new InszTabFragment(driver);
        kbo = new KboTabFragment(driver);
        lorem = new LoremTabFragment(driver);
        nihii = new NihiiTabFragment(driver);
        plates = new PlatesTabFragment(driver);
        polis = new PolisTabFragment(driver);
        riziv = new RizivTabFragment(driver);
        telephone = new TelephoneTabFragment(driver);
        uuid = new UuidTabFragment(driver);

    }

    public BisTabFragment openBisTab() {


        bis.openTab();

        return bis;

    }
    public InszTabFragment openInszTab() {


        insz.openTab();

        return insz;

    }
    public KboTabFragment openKboTab() {


        kbo.openTab();

        return kbo;

    }
    public LoremTabFragment openLoremTab() {


        lorem.openTab();

        return lorem;

    }
    public NihiiTabFragment openNihiiTab() {


        nihii.openTab();

        return nihii;

    }

    public PlatesTabFragment openPlatesTab() {

        plates.openTab();

        return plates;

    }
    public PolisTabFragment openPolisTab() {

        polis.openTab();

        return polis;

    }
    public RizivTabFragment openRizivTab() {

        riziv.openTab();

        return riziv;

    }
    public TelephoneTabFragment openTelephoneTab() {

        telephone.openTab();

        return telephone;

    }

    public UuidTabFragment openUuidTab() {

        uuid.openTab();

        return uuid;

    }

}
