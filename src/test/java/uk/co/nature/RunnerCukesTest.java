package uk.co.nature;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        dryRun = false,		//Does not run any code content in the step definition when it is true
        monochrome = true,	//Make text on the console readable
        plugin = {"pretty",
                "html:target/test-report/report-html",
                "json:target/test-report/report-json.json",
                "junit:target/test-report/report-xml.xml"},//Report Template
        snippets = SnippetType.CAMELCASE	//Used to determine what the method of the Step Def would be
//       ,glue = {""}  			//Package with Step Definitions and hooks
        ,tags = {"@regression"}


)








public class RunnerCukesTest {
}
