package StepDefinitions;

import Managers.FileReaderManager;
import Utilities.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;


public class Hooks {

    TestContext testContext;
    WebDriver webDriver;

    public Hooks(TestContext context){

        testContext = context;

    }

    @Before
    public void setUp() throws MalformedURLException {

        webDriver = testContext.getDriver();
        webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());

    }

    @After
    public void tearDown(){

        testContext.closeDriver();

    }

}
