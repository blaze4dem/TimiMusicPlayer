package com.example.android.timimusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Get playing song details from global class and set on corresponding text views

        SongInPlay songData = (SongInPlay) getApplicationContext();
        String song_name = songData.getSongName();
        String artist_name = songData.getArtistName();
        String song_duration = songData.getSongDuration();

        TextView displaySongName = (TextView) findViewById(R.id.song_name);
        displaySongName.setText(song_name);

        TextView displayArtistName = (TextView) findViewById(R.id.artist_name);
        displayArtistName.setText(artist_name);

        TextView displaySongDuration = (TextView) findViewById(R.id.song_duration);
        displaySongDuration.setText(song_duration);

         // Go back to song list

        android.widget.Button songList = (android.widget.Button) findViewById(R.id.song_list);
        songList.setOnClickListener( new android.view.View.OnClickListener(){

            @Override
            public void onClick(android.view.View view) {
                Intent gotoList = new Intent(play.this, MainActivity.class);
                startActivity(gotoList);
            }
        });
    }
}
