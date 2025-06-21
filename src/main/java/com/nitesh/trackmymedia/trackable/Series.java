package com.nitesh.trackmymedia.trackable;

public class Series extends MediaItem{
    private Integer season;

    public Series (String title, Integer season, int totalProgress, int currentProgress) {
        super(title, totalProgress, currentProgress);
        this.season = season;


    }

    @Override
    public String getStatus() {
        if (season != null && season > 0) {
            return "Season " + season + " - Episode " + currentProgress + " of " + totalProgress;
        } else {
            return "Episode " + currentProgress + " of " + totalProgress;

        }
    }
    
}
