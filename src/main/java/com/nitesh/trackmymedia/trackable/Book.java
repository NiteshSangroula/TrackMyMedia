package com.nitesh.trackmymedia.trackable;

public class Book extends MediaItem{

    public Book(String title, int totalProgress, int currentProgress) {
        super(title, totalProgress, currentProgress);
    }


    @Override
    public String getStatus() {
        return "Page "+currentProgress + " of "+ totalProgress;
    }

}
