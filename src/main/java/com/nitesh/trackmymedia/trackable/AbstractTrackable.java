package com.nitesh.trackmymedia.trackable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractTrackable implements Trackable {
    protected int currentProgress;
    protected int totalProgress;
}
