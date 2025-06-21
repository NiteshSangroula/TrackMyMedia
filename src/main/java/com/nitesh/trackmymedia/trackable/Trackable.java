package com.nitesh.trackmymedia.trackable;

public interface Trackable {

    String getTitle();
    String getStatus();
    void updateProgress(int progress);
}
