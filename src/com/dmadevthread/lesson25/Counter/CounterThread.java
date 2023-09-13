package com.dmadevthread.lesson25.Counter;

public class CounterThread extends Thread{
    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
             counter.increment();

        }
    }
}
