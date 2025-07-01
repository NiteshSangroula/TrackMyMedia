package com.nitesh.trackmymedia.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager<T> implements FileOperation<T> {
    private String dirName;
    private String fileName;

    public FileManager(String dirName, String fileName) {
        this.dirName = dirName;
        this.fileName = fileName;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() throws ClassNotFoundException, IOException {
        Path path = Paths.get(getStoragePath());
        File file = path.toFile();

        if (!file.exists() || file.length() == 0) {
            return null;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (T) ois.readObject();
        }
    }

    @Override
    public void set(T obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream( getStoragePath() ))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getStoragePath() {
        String os = System.getProperty("os.name").toLowerCase();
        String baseDir;

        if (os.contains("win")) {
            baseDir = System.getenv("APPDATA");
        } else if (os.contains("mac")) {
            baseDir = System.getProperty("user.home") + "/Library/Application Support";
        } else {
            baseDir = System.getProperty("user.home") + "/.local/share";
        }

        String fullPath = baseDir + "/" + dirName;
        new File(fullPath).mkdirs();  // ensure directory exists
        return fullPath + "/" + fileName;
    }


}
