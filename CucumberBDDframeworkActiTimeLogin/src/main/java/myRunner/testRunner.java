package myRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sandeepkumarakki\\eclipse-workspace\\selnium\\CucumberBDDframeworkActiTimeLogin\\src\\main\\java\\Features\\tasks.feature",
		glue= "stepDefinitions",
		monochrome=true,
		plugin= {"pretty","html:test-output","junit:junit_xml/cucumber.xml"},
		dryRun=false
		)
public class testRunner {

}
