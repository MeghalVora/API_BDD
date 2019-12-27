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

public class TwitterPost {

    String ConsumerKey = "asikySR47s9BCyy4nqjOaKn5b";
    String ConsumerSecret = "XC27NlEunmbktqoDsyGibA8yhmf6NyL6PKV297P67nufDsgR7M";
    String AccessKey = "1208759566172860416-CW73vqwbUt8bvUxlIGqqFXOqiuei4G";
    String TokenSecret = "NIvzNF581hfkxVtPzrTDWbQvvCgSwDdTNYUN52R2qXh9m";


    @Given("^User is on twitter home page$")
    public void user_is_on_twitter_home_page() {
        Response response = given()
                .when().get("https://twitter.com/home");


    }

    @When("^user click on post method$")
    public void user_click_on_post_method() {
        Response response = given().auth().oauth(ConsumerKey, ConsumerSecret, AccessKey, TokenSecret)

                .queryParam("status", "hello umer1")
                .when().post("https://api.twitter.com/1.1/statuses/update.json");

    }

    @Then("^user should be able to see post method$")
    public void user_should_be_able_to_see_post_method() {
        Response response = given().auth().oauth(ConsumerKey, ConsumerSecret, AccessKey, TokenSecret)
                .when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");
        response.prettyPrint();
        response.then().body("text", hasItems("hello umer1"));

    }
}


