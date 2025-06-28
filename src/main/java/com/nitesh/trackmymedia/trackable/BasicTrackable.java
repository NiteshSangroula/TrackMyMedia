package com.nitesh.trackmymedia.trackable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasicTrackable extends AbstractTrackable {
    public BasicTrackable(int currentProgress, int totalProgress) {
        super(currentProgress, totalProgress);
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
