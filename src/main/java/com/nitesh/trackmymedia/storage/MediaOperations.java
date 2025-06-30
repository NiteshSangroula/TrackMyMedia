package com.nitesh.trackmymedia.storage;

import java.util.List;

import com.nitesh.trackmymedia.media.MediaItem;

public interface MediaOperations {
    void add(MediaItem item);
    List<MediaItem> getAll();

    void update(List<MediaItem> items);
}
