package com.example.giorgiosantomasi.musicplayer.pojo;

import java.util.ArrayList;

/**
 * Created by giorgio.santomasi on 03/07/2018.
 */

public class Playlist {

    private String name;
    private ArrayList<Track> tracks;

    public Playlist(String name, ArrayList<Track> tracks){

        this.name = name;
        this.tracks = tracks;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }



}
