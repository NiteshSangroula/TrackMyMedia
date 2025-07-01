package com.nitesh.trackmymedia.manager;

import java.util.ArrayList;
import java.util.List;

import com.nitesh.trackmymedia.media.MediaItem;
import com.nitesh.trackmymedia.storage.MediaManager;

public class ProgressManager {
    private List<MediaItem> items;
    private MediaManager fileManager;

    public ProgressManager(MediaManager fileManager) {
        this.fileManager = fileManager;
        items = new ArrayList<>();
    }

    public void load() {
        items = new ArrayList<>(fileManager.getAll());
    }

    public void addItem(MediaItem item) {
        /*
        items.add(item);
        fileManager.add(item);
        */
        items.add(item);
        fileManager.add(item); 
    }

    public void showAllProgress() {
        int i = 0;
        for (MediaItem item: items) {
            System.out.println(i+". "+item.getTitle() + ":");
            System.out.println(item);
            System.out.println();
            i++;
        }
    }

    public void updateItem(int id, int progress) {
        items.get(id).performUpdateBehaviour(progress);
        fileManager.update(items);
    }

    public void deleteItem(int id) {
        items.remove(id);
        fileManager.update(items);
    }

}
