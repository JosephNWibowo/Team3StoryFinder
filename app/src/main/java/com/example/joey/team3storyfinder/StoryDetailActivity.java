package com.example.joey.team3storyfinder;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Joey on 12/1/2016.
 */

public class StoryDetailActivity extends AppCompatActivity {

    ImageView img;
    TextView nameTxt, descTxt;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Getting the data
        Intent i = this.getIntent();

        final String name = i.getExtras().getString("Name");
        final String desc = i.getExtras().getString("Description");
        final int image = i.getExtras().getInt("Image");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"some type of action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });

        //referecing the xml
        img = (ImageView) findViewById(R.id.StoryImage);
        nameTxt = (TextView) findViewById(R.id.StoryName);
        descTxt = (TextView) findViewById(R.id.StoryDescription);

        img.setImageResource(image);
        nameTxt.setText("Name: " + name );
        descTxt.setText("Description:" + desc);

    }
}
