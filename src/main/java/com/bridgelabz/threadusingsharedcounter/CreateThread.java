package com.bridgelabz.threadusingsharedcounter;

public class CreateThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int totalThread = 6;
        IncrementThread[] thread = new IncrementThread[totalThread];

        for (int i=0;i<totalThread;i++){
            thread[i] = new IncrementThread(counter);
            thread[i].start();
        }


        try {
            for (IncrementThread th: thread) {
                th.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());

    }
}
