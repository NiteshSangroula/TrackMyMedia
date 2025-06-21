package com.nitesh.trackmymedia.trackable;

public class Anime extends MediaItem{
    private Integer season;


    public Anime(String title, Integer season, int totalEpisode, int currentEpisode, Trackable updateBehaviour) {
        super (title, totalEpisode, currentEpisode, updateBehaviour);
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
