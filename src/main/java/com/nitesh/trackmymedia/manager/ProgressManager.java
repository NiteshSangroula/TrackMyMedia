package com.nitesh.trackmymedia.manager;

import java.util.ArrayList;
import java.util.List;

import com.nitesh.trackmymedia.trackable.Trackable;

public class ProgressManager {
    private List<Trackable> items;

    public ProgressManager() {
        items = new ArrayList<>();
    }

    public void addItem(Trackable item) {
        items.add(item);
    }

    public void showAllProgress() {
        for (Trackable item: items) {
            System.out.println(item.getTitle() + ":");
            System.out.println(item);
            System.out.println();
        }
    }

    public void updateItem(String title, int progress) {
        for (Trackable item: items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.updateProgress(progress);
                return;
            } 

        }
        System.out.println("Item not found!");
    }
    
}
