package com.deviprasad.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Balance {
    private int balance=1000;
    private int amount=40;


    private final Lock lock=new ReentrantLock();

    public void transact(){
        try{
            if(lock.tryLock(30, TimeUnit.SECONDS)){
                    if(balance>=amount){
                        try{
                            System.out.println(Thread.currentThread().getName()+"Starting transaction");
                            balance-=amount;
                            System.out.println("Completed transaction");
                            Thread.sleep(20000);
                            System.out.println("New Balance done by : "+Thread.currentThread().getName()+" "+this.balance);
                        }catch(InterruptedException e) {
                            System.out.println(e.getMessage());
                        }finally{
                            lock.unlock();
                        }
                    }
            }
            else{
                System.out.println(Thread.currentThread().getName()+"Can not acquire the Lock");
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
