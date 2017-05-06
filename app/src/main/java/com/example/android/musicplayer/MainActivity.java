package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicplayer.R.id.playlist;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the play music feature
        TextView play = (TextView) findViewById(R.id.play);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        // Find the View that shows the search feature
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the favorites list
        TextView favorites = (TextView) findViewById(R.id.favorites);

        // Set a click listener on that View
        favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the favorites View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });

        // Find the View that shows the playlist screen
        TextView list = (TextView) findViewById(playlist);

        // Set a click listener on that View
        list.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(listIntent);
            }
        });

    }
}
