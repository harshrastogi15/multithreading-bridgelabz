package com.bridgelabz.threadusingsharedcounter;

public class IncrementThread extends Thread {

    Counter counter;

    public IncrementThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName());
            counter.increaseCount();
        }

    }
}
