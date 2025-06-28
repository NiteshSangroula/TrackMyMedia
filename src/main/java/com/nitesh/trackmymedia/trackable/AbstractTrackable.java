package com.nitesh.trackmymedia.trackable;

import java.io.Serializable;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractTrackable implements Trackable, Serializable{
    protected int currentProgress;
    protected int totalProgress;

    public AbstractTrackable(int totalProgress, int currentProgress) {
        this.totalProgress = totalProgress;
        this.currentProgress = currentProgress;
    }
}
