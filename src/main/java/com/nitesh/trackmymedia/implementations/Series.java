package com.nitesh.trackmymedia.implementations;

import com.nitesh.trackmymedia.media.MediaItem;
import com.nitesh.trackmymedia.trackable.SeasonTrackable;

public class Series extends MediaItem {
    public Series (String title, Integer season, int totalProgress, int currentProgress) {
        super(title, new SeasonTrackable(season, totalProgress, currentProgress));
    }
}
