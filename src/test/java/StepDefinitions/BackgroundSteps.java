package StepDefinitions;

import io.cucumber.java.en.Given;

public class BackgroundSteps {

    private ContextSteps contextSteps;

    public BackgroundSteps(ContextSteps contextSteps){

        this.contextSteps = contextSteps;

    }

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page(){

        contextSteps.getDriver().get("https://d2r3v7evrrggno.cloudfront.net/");

    }

}
