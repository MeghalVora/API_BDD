package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.Matcher;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;


import static io.restassured.RestAssured.given;

public class ReqResTesting {


    @Given("^User is on reqres\\.in$")
    public void user_is_on_reqres_in()  {

        Response response=given()
                .when().get("https://reqres.in/");


    }

    @When("^user click on get button$")
    public void user_click_on_get_button()  {
        Response response=given()
                .when().get("https://reqres.in/api/users?page=2");



    }

    @Then("^user should be able to see correct response$")
    public void user_should_be_able_to_see_correct_response()  {
        Response response=given()
                .when().get("https://reqres.in/api/users?page=2");
        response.then().statusCode(200)
                .body("page",is(equalTo(2)));



        response.prettyPrint();




    }

}
