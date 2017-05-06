package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        /*some search algorithm should be implemented
         it should allow to search music files by title, artist name, album etc.
         maybe some loop with for statement could be used? it would have user input
         and would go through all the files in the music catalogue.
         than some method for displaying search results should be implemented*/
    }
}
