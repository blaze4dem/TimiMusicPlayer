package com.example.android.timimusicplayer;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Song> {

    // Constructor for the adapter
    public SongsAdapter(Activity context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the song_item.xml layout with the ID song_name
        TextView songNameView = (TextView) listItemView.findViewById(R.id.song_name);
        songNameView.setText(currentSong.getSongName());

        // Find the TextView in the song_item.xml layout with the artist_name
        TextView artistNameView = (TextView) listItemView.findViewById(R.id.artist_name);
        artistNameView.setText(currentSong.getArtistName());

        // Find the TextView in the song_item.xml layout with the id song_duration
        TextView durationView = (TextView) listItemView.findViewById(R.id.song_duration);
        durationView.setText(currentSong.getSongDuration());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
