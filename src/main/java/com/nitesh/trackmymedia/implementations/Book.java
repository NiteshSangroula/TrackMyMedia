package com.nitesh.trackmymedia.implementations;

import com.nitesh.trackmymedia.media.MediaItem;
import com.nitesh.trackmymedia.trackable.BasicTrackable;

public class Book extends MediaItem {

    public Book(String title, int totalProgress, int currentProgress) {
        super(title, new BasicTrackable(totalProgress, currentProgress));
    }
}
