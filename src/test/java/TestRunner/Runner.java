package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature\\Document.feature",
		glue = {"testcase"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"junit:src/test/java/reports/report.xml",
				"json:src/test/java/reports/report.json",
				"html:src/test/java/reports/report.html"
				},
		
				publish = true
		)
public class Runner 
{

}
