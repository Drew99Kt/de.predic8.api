package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json" },

		features = "src/test/resources", glue = "step_definitions",
		
		dryRun = false, tags = "@Test"

)

public class TestRunner {

}
