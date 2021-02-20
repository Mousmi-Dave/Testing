package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // driver class
@CucumberOptions(features = "features", dryRun = false, glue = "stepdef", plugin = { "pretty",
		"json:target/cucumber.json", "html:target/index.html" })

public class TestRunner {

}
