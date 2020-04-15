package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\sandeepkumarakki\\eclipse-workspace\\selnium\\suggesterCRMprojectCucumberBDDfrmWork\\src\\main\\java\\Features\\Tagging.feature",
		glue="stepDefinitions",
		plugin= {"pretty","html:test-output"},
		monochrome=true,
		strict=true,
		dryRun=false,
// ORed tag		tags= {"@SmokeTest , @RegressionTest"}
//ANDed tag		tags= {"@SmokeTest" , "@RegressionTest"}
	//	tags= {"~@SmokeTest" , "@RegressionTest"}        //ignore any test scenario using ~
		tags= {"@ExploratoryTest"}
		)
public class testRunn {

}
