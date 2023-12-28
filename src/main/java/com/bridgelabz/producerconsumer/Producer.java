package com.bridgelabz.producerconsumer;

public class Producer extends Thread {
    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run(){
        sharedBuffer.produce();
    }

}
