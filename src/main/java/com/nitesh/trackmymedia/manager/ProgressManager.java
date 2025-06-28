package com.nitesh.trackmymedia.manager;

import java.util.ArrayList;
import java.util.List;

import com.nitesh.trackmymedia.media.MediaItem;
import com.nitesh.trackmymedia.storage.MediaManager;
import com.nitesh.trackmymedia.trackable.Trackable;

public class ProgressManager {
    private List<MediaItem> items;
    //private MediaManager fileManager;

    public ProgressManager() {
        items = new ArrayList<>();
    }

    public void addItem(MediaItem item) {
        items.add(item);
        //fileManager.addItem(item);
    }

    public void showAllProgress() {
        //items = fileManager.getAll();
        for (MediaItem item: items) {
            System.out.println(item.getTitle() + ":");
            System.out.println(item);
            System.out.println();
        }
    }

    public void updateItem(String title, int progress) {
        for (MediaItem item: items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.performUpdateBehaviour(progress);
                return;
            } 

        }
        System.out.println("Item not found!");
    }
    
}
