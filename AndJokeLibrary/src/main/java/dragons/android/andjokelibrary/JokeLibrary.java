package dragons.android.andjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import dragons.android.jokeengine.JokeEngine;

public class JokeLibrary extends AppCompatActivity {

    private static final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();

        String mJoke = intent.getStringExtra(JOKE);

        TextView mTextView = findViewById(R.id.tvJoke);

        mTextView.setText(mJoke);


    }


}
