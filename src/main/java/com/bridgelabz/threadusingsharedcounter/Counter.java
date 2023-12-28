package com.bridgelabz.threadusingsharedcounter;

public class Counter {
    private int count = 0;

    public synchronized void increaseCount(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }
}
