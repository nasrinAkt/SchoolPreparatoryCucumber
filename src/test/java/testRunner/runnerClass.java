package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/SchoolFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition")//tags = {"@tag"})



public class runnerClass extends AbstractTestNGCucumberTests {

}
