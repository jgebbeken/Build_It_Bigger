package com.udacity.gradle.builditbigger.backend;

import dragons.android.jokeengine.JokeEngine;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        JokeEngine jokeEngine = new JokeEngine();
        String myData = jokeEngine.getJokes();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public String testData() {
        JokeEngine jokeEngine = new JokeEngine();
        String myData = jokeEngine.testJoke();
        return myData;
    }
}