package com.bridgelabz.semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for(int i=0;i<5;i++){
            Worker worker = new Worker(semaphore);
            worker.start();
        }

    }

    private static class Worker extends Thread {

        Semaphore semaphore;
        public Worker(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        public void run(){
            try {
                semaphore.acquire();
                System.out.println("Acquire thread : " + getName());
                sleep(2000);
                System.out.println("Release thread : " + getName());
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
