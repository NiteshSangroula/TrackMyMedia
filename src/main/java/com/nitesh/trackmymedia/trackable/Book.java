package com.nitesh.trackmymedia.trackable;

public class Book extends MediaItem{

    public Book(String title, int totalProgress, int currentProgress, Trackable updateBehaviour) {
        super(title, totalProgress, currentProgress, updateBehaviour);
    }


    /*
    public String getStatus() {
        return "Page "+currentProgress + " of "+ totalProgress;
    }
    */

}
