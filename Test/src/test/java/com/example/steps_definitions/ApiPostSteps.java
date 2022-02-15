package com.example.steps_definitions;

import com.example.actions.api.ApiPostActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiPostSteps {
    private final ApiPostActions apiPostActions = new ApiPostActions();

    @When("User does POST response")
    public void user_does_post_request() {
        apiPostActions.doPostResponse();
    }

    @Then("User has add list of posts")
    public void user_has_add_list_of_posts() {
        apiPostActions.validatePostResponse();
    }
}
