package com.deviprasad.multithreading.threadCommunication;

public class SharedResource{
    int data;
    boolean hasData;

    public synchronized void publish(int val) {
        if (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.data = val;
        hasData = true;
        System.out.println("Producing: "+this.data);
        notify();
    }

    public synchronized void consume() {
        if (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consume: " + this.data);
        hasData=false;
        notify();

    }
}