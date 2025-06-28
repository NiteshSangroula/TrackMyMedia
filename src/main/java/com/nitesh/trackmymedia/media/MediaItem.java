package com.nitesh.trackmymedia.media;

import java.io.Serializable;

import com.nitesh.trackmymedia.trackable.Trackable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class MediaItem implements Serializable{
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

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return updateBehaviour.getStatus();
    }
    
}
