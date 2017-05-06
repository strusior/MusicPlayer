package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

/*        a list of sound files is needed. to get files from device's memory File class should be
                used. Than that list should be organised in an array. than array can be used to
                 create ListView. */

        // Find the View that shows the play song music feature
        ImageView playSong = (ImageView) findViewById(R.id.play_song);

        // Set a click listener on that View
        playSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play song ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(PlayActivity.this, MainActivity.class);
                startActivity(playSongIntent);
            }
        });

        // Find the View that shows the details of chosen song
        ImageView details = (ImageView) findViewById(R.id.details);

        // Set a click listener on that View
        details.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the details ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent detailsIntent = new Intent(PlayActivity.this, DetailsActivity.class);
                startActivity(detailsIntent);
            }
        });

        // Find the View that opens search engine for searching songs
        ImageView search = (ImageView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlayActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Find the View that opens playlist creator
        ImageView list = (ImageView) findViewById(R.id.list);

        // Set a click listener on that View
        list.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the list ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(PlayActivity.this, ListActivity.class);
                startActivity(listIntent);
            }
        });

    }
}
