package com.example.actions.api;

import com.example.context.TestContext;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;


public class ApiPostActions {
    public void doPostResponse() {
        Response response = RestAssured.post("https://jsonplaceholder.typicode.com/posts");
        TestContext.VALUES.put("PostResponse", response);


    }
    public void validatePostResponse (){
        Response GetResponse = (Response) TestContext.VALUES.get("GetResponse");
        Assert.assertEquals(GetResponse.getStatusCode(),201);
    }
}
