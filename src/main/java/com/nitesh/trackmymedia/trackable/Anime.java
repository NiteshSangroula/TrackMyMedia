package com.nitesh.trackmymedia.trackable;

import com.nitesh.trackmymedia.media.MediaItem;

public class Anime extends MediaItem{
    public Anime(String title, Integer season, int totalProgress, int currentProgress) {
        super(title, new SeasonTrackable(season, totalProgress, currentProgress));
    }

    
}
