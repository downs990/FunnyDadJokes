package com.udacity.gradle.builditbigger.backend;

import com.downs.javajokelibrary.MyJoke;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

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

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "grabAJoke")
    public MyBean grabAJoke(){//@Named("name") String name) {
        MyBean response = new MyBean();
        MyJoke jokeObject = new MyJoke();
        response.setJoke(jokeObject.getJoke());
//        response.setData("Hi, " + name);

        return response;
    }

}
