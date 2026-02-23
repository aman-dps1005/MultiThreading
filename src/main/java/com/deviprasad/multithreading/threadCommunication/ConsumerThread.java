package com.deviprasad.multithreading.threadCommunication;

public class ConsumerThread extends Thread{
    SharedResource sr;

    public ConsumerThread(SharedResource sr){
        this.sr=sr;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            sr.consume();
        }
    }
}
