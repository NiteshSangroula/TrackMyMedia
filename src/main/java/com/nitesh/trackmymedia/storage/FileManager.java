package com.nitesh.trackmymedia.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.nitesh.trackmymedia.media.MediaItem;

public class FileManager implements MediaManager{

    private static final String APP_NAME = "TrackMyMedia";
    private static final String FILE_NAME = "mediaitems.ser";

    private static String getStoragePath() {
        String os = System.getProperty("os.name").toLowerCase();
        String baseDir;

        if (os.contains("win")) {
            baseDir = System.getenv("APPDATA");
        } else if (os.contains("mac")) {
            baseDir = System.getProperty("user.home") + "/Library/Application Support";
        } else {
            baseDir = System.getProperty("user.home") + "/.local/share";
        }

        String fullPath = baseDir + "/" + APP_NAME;
        new File(fullPath).mkdirs();  // ensure directory exists
        return fullPath + "/" + FILE_NAME;
    }
    @Override
    public List<MediaItem> getAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getStoragePath()))) {
            return (List<MediaItem>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void add(MediaItem item) {
        List<MediaItem> items = getAll();
        items.add(item);
        saveAll(items);
    }
    private void saveAll(List<MediaItem> items) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream( getStoragePath() ))) {
            oos.writeObject(items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void update(List<MediaItem> items) {
        saveAll(items);
    }

}
