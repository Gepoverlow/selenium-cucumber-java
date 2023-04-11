package Managers;

import PageObjects.HomePage;

public class PageObjectManager {

    private HomePage homePage;


    public HomePage getHomePage(){

        return homePage;

    }

    public void setHomePage(HomePage newHomePage){

        homePage = newHomePage;

    }

}
