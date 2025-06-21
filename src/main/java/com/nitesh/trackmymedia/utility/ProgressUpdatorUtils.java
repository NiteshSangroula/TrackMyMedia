
package com.nitesh.trackmymedia.utility;

import com.nitesh.trackmymedia.trackable.Trackable;

public class ProgressUpdatorUtils {
    public static class SimpleTrackable implements Trackable {

    }
    public static Trackable getSimpleTrackable() {
        return new Trackable() {

            public String getStatus() {
                if (season != null && season > 0) {
                    return "Season " + season + " - Episode " + currentProgress + " of " + totalProgress;
                } else {
                    return "Episode " + currentProgress + " of " + totalProgress;

                }
            }
            public void performUpdateBehaviour(int progress) {
                if (progress <= totalProgress) {
                    this.currentProgress = progress;
                }
            }
        };

    }

    public static Trackable getSeasonalTrackable() {

    }


}
