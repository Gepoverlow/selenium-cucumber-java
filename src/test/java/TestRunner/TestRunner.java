package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features",
        glue={"StepDefinitions"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
        },
        tags = "@bis"

)
public class TestRunner {

}
