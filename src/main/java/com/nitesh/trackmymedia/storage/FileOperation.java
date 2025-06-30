package com.nitesh.trackmymedia.storage;

import java.io.IOException;

public interface FileOperation<T>{

    T get()throws ClassNotFoundException, IOException;
    void set(T obj);
}
