package com.example.giorgiosantomasi.musicplayer.pojo;

import java.io.File;
import java.util.HashMap;

/**
 * Created by giorgio.santomasi on 03/07/2018.
 */

public class Track {

    private String title;
    private String artist;
    private String data;
    private String album;
    private File track;
    private HashMap<String,String> otherInfo;

    public Track(String title, String artist, File track){
        this.artist = artist;
        this.title = title;
        this.track = track;
    }

    public Track(String data, String title, String album, String artist) {
        this.data = data;
        this.title = title;
        this.album = album;
        this.artist = artist;
    }

    public Track(String title, String artist, File track, HashMap<String,String> otherInfo){
        this.artist = artist;
        this.title = title;
        this.track = track;
        this.otherInfo = otherInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public File getTrack() {
        return track;
    }

    public void setTrack(File track) {
        this.track = track;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public HashMap<String, String> getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(HashMap<String, String> otherInfo) {
        this.otherInfo = otherInfo;
    }


}
