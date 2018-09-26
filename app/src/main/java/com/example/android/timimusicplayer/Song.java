package com.example.android.timimusicplayer;

public class Song {

    private String mSongName;
    private String mArtist;
    private String mDuration;

    public Song(String songName, String artist, String duration){

        mSongName = songName;
        mArtist = artist;
        mDuration = duration;
    }

    // Get song name from the song class
    public String getSongName(){
        return mSongName;
    }

    // Get artist name from the song class
    public String getArtistName(){
        return mArtist;
    }

    // Get song duration from the song class
    public String getSongDuration(){
        return mDuration;
    }
}
