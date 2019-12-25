package utils;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import  io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.Matcher;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Desktop/com.bdd.Cucumber/com.bdd.Cucumber/src/test/java/resources/ReqResScenarioOutline.Feature",glue = {"StepDefs"},plugin = "json:target/cucumber.json")

public class RunCuckesTest {

}
