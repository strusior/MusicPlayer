package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // Find the View that leads to catalogue of songs
        TextView addtofav = (TextView) findViewById(R.id.addtofav);

        // Set a click listener on that View
        addtofav.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the add to favorites View is clicked on.
            @Override
            public void onClick(View view) {
                Intent addtofavIntent = new Intent(FavoritesActivity.this, PlayActivity.class);
                startActivity(addtofavIntent);
            }
        });

        /*Favorites list would be created basing on how many times the song has been played
        * so some algorithm counting that and method for soring that data should be used
        than some algorithm sorting songs by number of times played*/
    }
}
