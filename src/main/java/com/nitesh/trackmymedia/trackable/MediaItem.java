package com.nitesh.trackmymedia.trackable;

public abstract class MediaItem {
    protected Trackable updateBehaviour;
    protected String title;
    protected int currentProgress;
    protected int totalProgress;

    public MediaItem(String title, int totalProgress, int currentProgress, Trackable updateBehaviour) {
        this.title = title;
        this.totalProgress = totalProgress;
        this.currentProgress = currentProgress;

    }
    //create two args constructor for new book with no curruent progress

    public String getTitle() {
        return title;
    }

    public void performUpdateBehaviour(int progress) {
        updateBehaviour.updateProgress(progress);
        /*
        if (progress <= totalProgress) {
            this.currentProgress = progress;
        }
        */
    }

    @Override
    public String toString() {
        return updateBehaviour.getStatus();
    }
    
}
