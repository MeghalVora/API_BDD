package utils;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Feature;




@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/resources/Reqres.Feature",glue = {"StepDefs"},plugin = "json:target/cucumber.json")
//@CucumberOptions(features = "src/test/java/resources/TwitterPost.Feature",glue = {"StepDefs"},plugin = "json:target/cucumber.json")
//@CucumberOptions(features = "src/test/java/resources/TwitterDelete.Feature",glue = {"StepDefs"},plugin = "json:target/cucumber.json")
@CucumberOptions(features = "src/test/java/resources/TwitterGet.Feature",glue = {"StepDefs"},plugin = "json:target/cucumber.json")



public class RunCuckesTest {

}
