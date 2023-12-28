package com.bridgelabz.producerconsumer;

public class Consumer extends Thread{
    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run(){
        sharedBuffer.consume();
    }
}
