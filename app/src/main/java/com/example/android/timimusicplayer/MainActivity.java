package com.example.android.timimusicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Killing Me Softly", "Lurin Hill","3:40 mins"));
        songs.add(new Song("Love Me Tender", "Lagbaja","4:30 mins"));
        songs.add(new Song("Fried Chicken", "Eaters","2:30 mins"));
        songs.add(new Song("New things", "Flap Boys","3:00 mins"));
        songs.add(new Song("Young And Handsome", "Shap shap","3:50 mins"));
        songs.add(new Song("Thunder", "Oranga","4:30 mins"));
        songs.add(new Song("Black Chicken", "Sweepers","2:40 mins"));
        songs.add(new Song("Love things", "FGang","3:10 mins"));
        songs.add(new Song("Exhale", "Kap","3:19 mins"));
        songs.add(new Song("Real Wife", "Dg Aga","7:10 mins"));
        songs.add(new Song("Jumping Sticks and Bottles", "Shagari","3:10 mins"));
        songs.add(new Song("Yo Yo Yo", "Oghe","3:10 mins"));

        SongsAdapter songs_adapter = new SongsAdapter(this, songs);

        ListView songList = (ListView) findViewById(R.id.songs_list);
        songList.setAdapter(songs_adapter);

        songList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song song = (Song) adapterView.getItemAtPosition(i);
                Intent viewSongDetails = new Intent(MainActivity.this, details.class);
                viewSongDetails.putExtra("song_name", song.getSongName());
                viewSongDetails.putExtra("artist_name", song.getArtistName());
                viewSongDetails.putExtra("song_duration", song.getSongDuration());
                startActivity(viewSongDetails);
            }
        });


        // Event Listener to Get the current playing song

        android.widget.Button playingSong = (android.widget.Button) findViewById(R.id.song_in_play);
        playingSong.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent gotoPlaying = new Intent(MainActivity.this, play.class);
                startActivity(gotoPlaying);
            }
        });

    }


}
