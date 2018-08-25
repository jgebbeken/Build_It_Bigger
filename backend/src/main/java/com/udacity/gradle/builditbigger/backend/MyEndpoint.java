package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a joke from the Joke Engine */
    @ApiMethod(name = "servJokes")
    public MyBean servJokes() {
        MyBean response = new MyBean();
        response.getData();

        return response;
    }

    @ApiMethod(name = "testJokes")
    public MyBean testJokes() {
        MyBean response = new MyBean();
        response.testData();
        return response;
    }

}
