package com.example.joey.team3storyfinder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class StoryMainActivity extends AppCompatActivity {

    //todo put some data info

    String[] name = {
            "Hasan Niftiyev",
            "Andre Simpelo",
            "Joseph Nathan Wibowo",
            "James Bond",
            "CoolDuck",
            "Mario Pizza",
            "Shroom",
            "Yoshishi",
    };

    String[] description = {
            "Amazing clever man",
            "Awesome dude",
            "Just an average Joe",
            "too good to spy",
            "quack quack",
            "its a MARIO!!",
            "high as a kite",
            "just a stepping stone to get to the next level",
    };

    int[] images ={
            R.drawable.monster,
            R.drawable.luigi,
            R.drawable.homer,
            R.drawable.blackstar,
            R.drawable.greenduck,
            R.drawable.mario,
            R.drawable.mushroom,
            R.drawable.yoshi,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Reference Recycler view from the layout content story main xml id
        RecyclerView rView = (RecyclerView) findViewById(R.id.rv);

        //Setting the properties
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setItemAnimator(new DefaultItemAnimator());


        //adapter
        StoryAdapter adapter = new StoryAdapter(this, name, description, images);
        rView.setAdapter(adapter);


    }

}
