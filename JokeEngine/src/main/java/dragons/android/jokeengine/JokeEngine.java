package dragons.android.jokeengine;

import java.util.ArrayList;
import java.util.Random;

public class JokeEngine {


/*
    Jokes taken from reader's digest website
    https://www.rd.com/jokes/
*/


    public JokeEngine() {

    }


    /* When getJokes is called it will decide randomly if it should display a cat or dog joke.
       The chosen type of joke will grab all of the jokes in that particular category and once
       again choose a joke from the six inside the ArrayList and return.
     */

    public String getJokes(){

        String mJoke;
        Random random = new Random();
        int mNumber = random.nextInt(2);

        switch (mNumber){
            case 0: mJoke = servCatJokes();
            break;
            default: mJoke = servDogJokes();
        }

        return mJoke;
    }

    // Used in Unit Test to test the Async function
    public String testJoke(){

        return "Q: What do you call a cold dog?\n\nA: A Chilli Dog.\n\n";
    }

    private String servCatJokes() {

        String mJoke;
        CatJokes catJokes = new CatJokes();
        Random random = new Random();
        int mNumber = random.nextInt(6);

        ArrayList<String> mCatJokes;
        mCatJokes = catJokes.getStrCatJokes();

        mJoke = chooseJoke(mNumber,mCatJokes);

        return mJoke;
    }

    private String servDogJokes(){

        String mJoke;
        Random random = new Random();
        int mNumber = random.nextInt(6);

        DogJokes dogJokes = new DogJokes();
        ArrayList<String> mDogJokes;
        mDogJokes = dogJokes.getDogJokes();

        mJoke = chooseJoke(mNumber, mDogJokes);

        return  mJoke;
    }

    private String chooseJoke(int number, ArrayList<String> jokes){
        String mJoke;

        mJoke = jokes.get(number);
        return mJoke;

    }

}
