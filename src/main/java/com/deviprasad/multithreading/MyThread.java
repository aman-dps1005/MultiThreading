package com.deviprasad.multithreading;

public class MyThread extends Thread{
    private Balance balance;

    public MyThread(Balance balance){
        this.balance=balance;
    }

    @Override
    public void run(){
        balance.transact();
    }
}
