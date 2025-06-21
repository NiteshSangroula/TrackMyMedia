package com.nitesh.trackmymedia.media;

import com.nitesh.trackmymedia.trackable.Trackable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MediaItem {
    protected Trackable updateBehaviour;
    protected String title;

    public MediaItem(String title, Trackable updateBehaviour) {
        this.title = title;
        this.updateBehaviour = updateBehaviour;

    }
    //create two args constructor for new book with no curruent progress


    public void performUpdateBehaviour(int progress) {
        updateBehaviour.updateProgress(progress);
    }

    @Override
    public String toString() {
        return updateBehaviour.getStatus();
    }
    
}
