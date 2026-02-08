package com.deviprasad.multithreading;

public class NewThread extends Thread{
    public Resource resource;

    public NewThread(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run(){
//        System.out.println(Thread.currentThread().threadId()+","+Thread.currentThread().getName());
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
////        try {
////            Thread.sleep(10000);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//        for(int i=0;i<1e7;i++){
//            System.out.println(i);
//        }

        for(int i=0;i<1000;i++){
            resource.increment();
        }

    }
}
