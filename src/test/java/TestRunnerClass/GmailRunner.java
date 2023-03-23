package TestRunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
				 glue = "org.stepdefenition",
				 monochrome = true,
				 dryRun = true,
				 tags = "@Gmail"
				 )
public class GmailRunner {

}
