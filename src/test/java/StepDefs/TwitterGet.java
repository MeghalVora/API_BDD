package StepDefs;
import io.restassured.response.Response;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.Matcher;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;


import static io.restassured.RestAssured.given;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterGet {
    String ConsumerKey = "asikySR47s9BCyy4nqjOaKn5b";
    String ConsumerSecret = "XC27NlEunmbktqoDsyGibA8yhmf6NyL6PKV297P67nufDsgR7M";
    String AccessKey = "1208759566172860416-CW73vqwbUt8bvUxlIGqqFXOqiuei4G";
    String TokenSecret = "NIvzNF581hfkxVtPzrTDWbQvvCgSwDdTNYUN52R2qXh9m";


    @Given("^User is on twitter comment page$")
    public void user_is_on_twitter_comment_page()  {
        Response response=given()
                .when().get("https://twitter.com/home");

    }

    @When("^user run get method in automation framework$")
    public void user_run_get_method_in_automation_framework() {
        Response response=given().
                when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");

    }

    @Then("^user should be able to see comment on twitter$")
    public void user_should_be_able_to_see_comment_on_twitter()  {
        Response response=given().auth().oauth (ConsumerKey, ConsumerSecret, AccessKey, TokenSecret)
                .when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");
        response.then().body("text",hasItems("hello umer"));
        response.prettyPrint();




    }


}
