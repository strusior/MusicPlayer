package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Find the View that leads to catalogue of songs
        TextView addtolist = (TextView) findViewById(R.id.addtolist);

        // Set a click listener on that View
        addtolist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the add View is clicked on.
            @Override
            public void onClick(View view) {
                Intent addtolistIntent = new Intent(ListActivity.this, PlayActivity.class);
                startActivity(addtolistIntent);
            }
        });

        /*a method for storing lists would be needed*/
    }
}
