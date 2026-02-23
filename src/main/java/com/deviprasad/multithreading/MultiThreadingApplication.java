package com.deviprasad.multithreading;

import com.deviprasad.multithreading.threadCommunication.ConsumerThread;
import com.deviprasad.multithreading.threadCommunication.ProducerThread;
import com.deviprasad.multithreading.threadCommunication.SharedResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiThreadingApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(MultiThreadingApplication.class, args);
//        System.out.println(Thread.currentThread().getName());
//
//        Resource myResource= new Resource();
//        NewThread nT=new NewThread(myResource);
//        NewThread nT2=new NewThread(myResource);
////        nT.start();
////        System.out.println(nT.getState());
////        nT.join();
////        System.out.println(nT.getPriority());
////        System.out.println(nT.getState());
//        nT.start();
//        nT2.start();
//        try{
//            nT.join();
//            nT2.join();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(myResource.getCount());
//        Balance balance=new Balance();
//
//        MyThread t1=new MyThread(balance);
//        MyThread t2=new MyThread(balance);
//
//        t1.start();
//        t2.start();
//        try{
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
        SharedResource sr=new SharedResource();
        ProducerThread pt=new ProducerThread(sr);
        ConsumerThread ct=new ConsumerThread(sr);

        pt.start();
        ct.start();
    }

}
