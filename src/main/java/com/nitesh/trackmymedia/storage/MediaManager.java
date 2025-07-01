package com.nitesh.trackmymedia.storage;

import java.io.*;
import java.util.ArrayList;
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
            if (fileHandler.get() != null) {
                List<MediaItem> items = new ArrayList<>(fileHandler.get());
                return items;
            } else {
                return Collections.emptyList();
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return Collections.emptyList(); 
        }
    }

    @Override
    public void add(MediaItem item) {
        List<MediaItem> items = new ArrayList<>(getAll()); // ✅ mutable copy
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
