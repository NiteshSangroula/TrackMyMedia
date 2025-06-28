package com.nitesh.trackmymedia.trackable;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractTrackable implements Trackable {
    protected int currentProgress;
    protected int totalProgress;

    public AbstractTrackable(int currentProgress2, int totalProgress2) {
        currentProgress = currentProgress2;
        totalProgress = totalProgress2;
    }
}
