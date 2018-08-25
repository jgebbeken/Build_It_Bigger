package dragons.android.jokeengine;

import java.util.ArrayList;

public class CatJokes {



    // Jokes list copied from Reader's Digest website
    // https://www.rd.com/jokes/

    public CatJokes(){

    }

    public ArrayList<String> getStrCatJokes() {

        ArrayList<String> catJokes = new ArrayList<>();

        catJokes.add("Q: What did the cat say when he went bankrupt?\n" +
                "\n" +
                "A: I feel so paw!\n" +
                "\n");

        catJokes.add("Q: What's every cat's favorite color?\n" +
                "\n" +
                "A: Purrrrrrple!\n" +
                "\n");

        catJokes.add("Q: Why don't cats like shopping online? \n" +
                "\n" +
                "A: They prefer a cat-alogues.\n" +
                "\n");

        catJokes.add("Q: What do cats wear at night?\n" +
                "\n" +
                "A: Paw-jamas.\n" +
                "\n");
        catJokes.add("Q: What do you get if you cross a cat with Father Christmas?\n" +
                "\n" +
                "A: Santa Claws!\n" +
                "\n");

        catJokes.add("Q: What do you call a cat that gets anything it wants?\n" +
                "\n" +
                "A: Purrr-suasive.\n" +
                "\n");

        return catJokes;
    }


}
