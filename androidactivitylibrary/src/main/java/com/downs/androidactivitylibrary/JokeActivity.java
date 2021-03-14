package com.downs.androidactivitylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String newJoke = "";
        if(intent != null){
            newJoke = intent.getStringExtra("NEW_JOKE");
        }

        TextView jokeTextView = findViewById(R.id.joke_tv);
        jokeTextView.setText(newJoke);



    }
}