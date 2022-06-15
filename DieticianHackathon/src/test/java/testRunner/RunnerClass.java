package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "C:\\Users\\shobh\\eclipse-workspace\\DieticianHackathon\\src\\test\\resources\\Features",
		glue = {"StepDefinition"},
		dryRun =false,
		plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"html:target/HtmlReports1/report.html",
				"json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"junit:target/cucumber-junit-report.xml",
				"rerun:target/failed_scenarios.txt"
		},
		monochrome = true
		)

public class RunnerClass {

}
