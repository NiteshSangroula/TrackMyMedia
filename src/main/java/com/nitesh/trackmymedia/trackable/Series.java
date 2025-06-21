package com.nitesh.trackmymedia.trackable;

public class Series extends MediaItem{
    private Integer season;

    public Series (String title, Integer season, int totalProgress, int currentProgress, Trackable updateBehaviour) {
        super(title, totalProgress, currentProgress, updateBehaviour);
        this.season = season;


    }

    /*
    public String getStatus() {
        if (season != null && season > 0) {
            return "Season " + season + " - Episode " + currentProgress + " of " + totalProgress;
        } else {
            return "Episode " + currentProgress + " of " + totalProgress;

        }
    }
    */
    
}
