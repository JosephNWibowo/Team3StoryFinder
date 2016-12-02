package com.example.joey.team3storyfinder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Joey on 12/1/2016.
 */

public class StoryAdapter extends RecyclerView.Adapter<StoryHolder> {

    Context context;
    String[] person;
    String[] description;
    int[] images;

    /**
     *Assigning the value of the story content to the adapter
     */
    public StoryAdapter(Context c, String[] nPerson, String[] nDescription, int[] nImages) {

        context = c;
        person = nPerson;
        description = nDescription;
        images = nImages;

    }


    /**
     * To inflate the view when creating the holder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public StoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_model, null);


        StoryHolder holder = new StoryHolder(v);

        return holder;
    }

    /**
     * Binding the data to the view
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(StoryHolder holder, final int position) {
        holder.name.setText(person[position]);
        holder.description.setText(description[position]);
        holder.img.setImageResource(images[position]);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            // hooking the detail activity on click
            public void onItemClick(View v, int pos) {
                Intent intent = new Intent(context, StoryDetailActivity.class);

                intent.putExtra("Image", images[position]);
                intent.putExtra("Name",person[position]);
                intent.putExtra("Description",person[position]);


                context.startActivity(intent);

            }
        });
    }


    /**
     *  Returning the size of the array
     * @return
     */
    @Override
    public int getItemCount() {
        return person.length;
    }
}
