package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.downs.androidactivitylibrary.JokeActivity;
import com.downs.javajokelibrary.MyJoke;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Call my endpoint
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));

        // TODO: Fix the ads IDs and update the name of the app in AsMob.

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchLibraryActivity(View view){

        // My java library
        MyJoke mj = new MyJoke();
        Toast.makeText(this, "Joke: " + mj.getJoke(), Toast.LENGTH_LONG).show();

        // My Android Library
        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra("NEW_JOKE", mj.getJoke());
        startActivity(intent);
    }

}
