package com.deviprasad.multithreading.threadCommunication;

public class ProducerThread extends Thread{
    SharedResource sr;

    public ProducerThread(SharedResource sr){
        this.sr=sr;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            sr.publish(i);
        }
    }
}
