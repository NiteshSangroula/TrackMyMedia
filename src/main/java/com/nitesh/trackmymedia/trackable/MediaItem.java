package com.nitesh.trackmymedia.trackable;

public abstract class MediaItem implements Trackable{
    protected String title;
    protected int currentProgress;
    protected int totalProgress;

    public MediaItem(String title, int totalProgress, int currentProgress) {
        this.title = title;
        this.totalProgress = totalProgress;
        this.currentProgress = currentProgress;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void updateProgress(int progress) {
        if (progress <= totalProgress) {
            this.currentProgress = progress;
        }
    }

    @Override
    public String toString() {
        return getStatus();
    }
    
}
