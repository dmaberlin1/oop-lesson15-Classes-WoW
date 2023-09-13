package com.dmadevthread.lesson26.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable{
    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Rocket is preparing to launch...");
        try {
            countDownLatch.await();
            System.out.println("RUN!!!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
