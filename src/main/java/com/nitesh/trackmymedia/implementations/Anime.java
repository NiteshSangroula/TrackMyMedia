package com.nitesh.trackmymedia.implementations;

import com.nitesh.trackmymedia.media.MediaItem;
import com.nitesh.trackmymedia.trackable.SeasonTrackable;

public class Anime extends MediaItem {
    public Anime(String title, Integer season, int totalEpisode, int currentEpisode) {
        super (title, new SeasonTrackable(season, totalEpisode, currentEpisode));
    }
}
