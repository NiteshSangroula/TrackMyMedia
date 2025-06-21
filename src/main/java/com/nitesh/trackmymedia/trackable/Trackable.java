package com.nitesh.trackmymedia.trackable;

public interface Trackable {

    String getStatus();
    void updateProgress(int progress);

    default void nextChapter() {}
    default void previousChapter() {}
}
