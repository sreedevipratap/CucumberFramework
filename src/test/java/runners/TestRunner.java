package runners;
/*just a sample message test */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue = {"stepDefinitions"})
public class TestRunner {

	/*to test*/
}
