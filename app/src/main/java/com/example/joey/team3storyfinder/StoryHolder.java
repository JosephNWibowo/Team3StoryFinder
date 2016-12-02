package com.example.joey.team3storyfinder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Joey on 12/1/2016.
 */

public class StoryHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView img;
    TextView name, description;
    ItemClickListener itemClickListener;


    public StoryHolder(View itemview) {
        super(itemview);

        img = (ImageView) itemview.findViewById(R.id.StoryImage);
        name = (TextView) itemview.findViewById(R.id.StoryName);
        description = (TextView) itemview.findViewById(R.id.StoryDescription);

        itemview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        itemClickListener.onItemClick(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        itemClickListener = ic;
    }
}
