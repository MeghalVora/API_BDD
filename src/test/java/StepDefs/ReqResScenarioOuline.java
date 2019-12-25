package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.internal.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.Matcher;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;

public class ReqResScenarioOuline {

    @Given("^User is on reqres\\\\.in$")
    public void user_is_on_reqres_in()  {
       // Response response=given()
         //       .when().get("https://reqres.in/");


    }

    @When("^user type \"([^\"]*)\"$")
    public void user_type(String arg1) {
        Response response=given()
                .when().get("<endpoints>");

    }

    @Then("^User should be able to see \"([^\"]*)\"\\.$")


    public void user_should_be_able_to_see(String arg1) {









        //  Response response=given()
        //        .when().get("<endpoints>");
       //response.then().statusCode()
    }


}
