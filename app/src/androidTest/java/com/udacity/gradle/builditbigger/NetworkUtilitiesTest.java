package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class NetworkUtilitiesTest{

    Context context;


    // Tests to see if joke can be passed from the Google Cloud Endpoint via AsyncTask.
    // An error may result if the server is offline and will pass if the server is on and
    // length of the joke is more than 0 characters.

    @Test
    public void testAsyncFunction() throws InterruptedException{

        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);
        context = InstrumentationRegistry.getContext();
        NetworkUtilities networkUtilities = new NetworkUtilities(){
          @Override
          protected void onPostExecute(String result){
              assertNotNull(result);
              if(result != null){
                  assertTrue(result.length() > 0);
                  latch.countDown();
              }
          }
        };
        networkUtilities.execute(context);
        latch.await();
    }
}
