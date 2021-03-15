package com.udacity.gradle.builditbigger;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;


public class ExampleUnitTest {


    @Test
    public void testVerifyEchoResponse() {

        EndpointsAsyncTask endpointTask = new EndpointsAsyncTask(
                new EndpointsAsyncTask.OnCompletionListener() {
                    @Override
                    public void onComplete(String joke) {
                        // Test to make sure joke is a non-empty string.
                        assertNotNull(joke);

                    }
                });

//        endpointTask.execute(new Pair<Context, String>(context, "Manfred"));
        endpointTask.execute();

    }




}
