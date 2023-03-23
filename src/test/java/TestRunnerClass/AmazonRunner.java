package TestRunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefenition", monochrome = true, dryRun = false, snippets = SnippetType.UNDERSCORE, tags = "@Amazon", plugin = {
		"html:Amazon\\htmlReport.html", "json:Amazon\\jsonReport.json", "junit:Amazon\\junitReport.xml" }

)

public class AmazonRunner {

}
