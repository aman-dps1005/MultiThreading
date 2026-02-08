package com.deviprasad.multithreading;

public class Resource {
    private int count=0;

    public void increment(){
        synchronized (this) {
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}
