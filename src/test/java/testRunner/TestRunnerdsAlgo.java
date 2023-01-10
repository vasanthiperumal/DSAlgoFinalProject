package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"stepDefinition"},
plugin = {"json:target/json/report.json" })
public class TestRunnerdsAlgo {

}
