package com.nitesh.trackmymedia.storage;

import java.io.*;
import java.util.Collections;
import java.util.List;

import com.nitesh.trackmymedia.media.MediaItem;

public class MediaManager implements MediaOperations{

    private FileOperation<List<MediaItem>> fileHandler;

    public MediaManager(FileOperation<List<MediaItem>> fileHandler) {
        this.fileHandler = fileHandler;
    }

    @Override
    public List<MediaItem> getAll() {
        try {
            return fileHandler.get();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    @Override
    public void add(MediaItem item) {
        List<MediaItem> items = getAll();
        items.add(item);
        saveAll(items);
    }
    private void saveAll(List<MediaItem> items) {
        fileHandler.set(items);
    }
    @Override
    public void update(List<MediaItem> items) {
        saveAll(items);
    }

}
