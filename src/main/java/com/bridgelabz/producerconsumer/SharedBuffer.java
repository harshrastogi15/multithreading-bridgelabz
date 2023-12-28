package com.bridgelabz.producerconsumer;

import java.util.LinkedList;

public class SharedBuffer {

    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 5;


    public synchronized void produce() {
        while (true){
            try {
                while(buffer.size() == capacity){wait();}

                int item = (int)Math.floor(Math.random()*100);

                buffer.add(item);
                System.out.println(Thread.currentThread().getName() + " producer : " + item);

                notify();

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public synchronized void consume() {
        while (true){
            try {
                while (buffer.isEmpty()){wait();}
                int item = buffer.removeFirst();
                System.out.println(Thread.currentThread().getName() + " consumer : " + item);

                notify();
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
