package com.nitesh.trackmymedia.implementations;

import com.nitesh.trackmymedia.media.MediaItem;
import com.nitesh.trackmymedia.trackable.BasicTrackable;
import com.nitesh.trackmymedia.trackable.Trackable;

public class Book extends MediaItem {

    public Book(String title, int totalProgress, int currentProgress) {
        super(title, new BasicTrackable(currentProgress, totalProgress));
    }
}
