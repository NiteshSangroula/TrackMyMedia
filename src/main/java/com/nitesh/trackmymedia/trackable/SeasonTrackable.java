package com.nitesh.trackmymedia.trackable;

import lombok.Setter;

@Setter
public class SeasonTrackable extends AbstractTrackable {
    private Integer season;

    public SeasonTrackable(Integer season, int totalEpisode, int currentEpisode) {
        super(totalEpisode, currentEpisode);
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

    @Override
    public void updateProgress(int progress) {
        //Some update season logic here
    }

    @Override
    public void nextChapter() {
        super.nextChapter();
    }

    @Override
    public void previousChapter() {
        super.previousChapter();
    }
}
