package com.nitesh.trackmymedia.trackable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasicTrackable extends AbstractTrackable {
    public BasicTrackable(int totalProgress, int currentProgress) {
        super(totalProgress, currentProgress);
    }

    @Override
    public String getStatus() {
        return "Page "+currentProgress + " of "+ totalProgress;
    }
    @Override
    public void updateProgress(int progress) {
        if (progress <= totalProgress) {
            this.currentProgress = progress;
        }
    }
}
