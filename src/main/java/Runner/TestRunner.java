package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/nibir/eclipse-workspace/FreeCrmBddFramework/src/main/java/Features"
		,glue= {"StepDefinitions"}
		
		)

public class TestRunner {

}
