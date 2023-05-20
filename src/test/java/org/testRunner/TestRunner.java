package org.testRunner;

/* RunastestNg
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
*/
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="src/test/resources/org.features",
		glue = {"org/stepdefinations","org.applicationhooks"},
		monochrome = true,
		dryRun = false,
		//tags= "@Smoke",  // to run specific tc
		plugin = {"pretty",
				"html:target/html_report/cucumber_report.html",
				"json:target/json_report/json_report.json",
				"junit:target/junit_report/junit_report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
	
		)

public class TestRunner  {   //extends AbstractTestNGCucumberTests run as testNg

}
