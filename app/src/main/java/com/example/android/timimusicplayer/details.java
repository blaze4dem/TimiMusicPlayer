package com.example.android.timimusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get incoming details from intent and set on corresponding text views
        Intent songData = getIntent();
        final String song_name = songData.getStringExtra("song_name");
        final String artist_name = songData.getStringExtra("artist_name");
        final String song_duration = songData.getStringExtra("song_duration");

        TextView displaySongName = (TextView) findViewById(R.id.song_name);
        displaySongName.setText(song_name);

        TextView displayArtistName = (TextView) findViewById(R.id.artist_name);
        displayArtistName.setText(artist_name);

        TextView displaySongDuration = (TextView) findViewById(R.id.song_duration);
        displaySongDuration.setText(song_duration);

        // Event Listener for Play Button

        TextView playingSong = (TextView) findViewById(R.id.play_song);
        playingSong.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // update song in play
                SongInPlay.setSongName(song_name);
                SongInPlay.setArtist(artist_name);
                SongInPlay.setDuration(song_duration);

                Intent gotoPlaying = new Intent(details.this, play.class);
                startActivity(gotoPlaying);
            }
        });

        // Go back to song list

        android.widget.Button songList = (android.widget.Button) findViewById(R.id.song_list);
        songList.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent gotoList = new Intent(details.this, MainActivity.class);
                startActivity(gotoList);
            }
        });
    }
}
