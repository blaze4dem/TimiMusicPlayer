package com.example.android.timimusicplayer;

import android.app.Application;


public class SongInPlay extends Application {

    // Static variables to hold static song data
    private static String songName;
    private static String artist;
    private static String duration;

    private static SongInPlay singleton;

    private static SongInPlay getInstance(){
        return singleton;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }

    // Get song name............................
    public String getSongName(){
        return songName;
    }

    // Get artist name of song..................
    public String getArtistName(){
        return artist;
    }

    // Get song duration .......................
    public String getSongDuration(){
        return duration;
    }

    // Set song name in global class.............................
    public static void setSongName(String mSongName){
        songName = mSongName;
    }

    // Set artist name in global class...........................
    public static void setArtist(String mArtist){
        artist = mArtist;
    }

    // Set song duration in global class...........................
    public static void setDuration(String mDuration){
        duration = mDuration;
    }
}
