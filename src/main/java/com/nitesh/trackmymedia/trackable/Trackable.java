package com.nitesh.trackmymedia.trackable;

public interface Trackable {

    String getStatus();
    //void updateProgress(TrackableProgress progress);
    void updateProgress(int progress);

    default void nextChapter() {}
    default void previousChapter() {}
}
