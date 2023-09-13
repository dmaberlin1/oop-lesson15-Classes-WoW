package com.dmadevthread.lesson26.latch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable{
    private final CountDownLatch countDownLatch;
    private final RocketDetail rocketDetail;

    public RocketDetailRunnable(RocketDetail rocketDetail,CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.rocketDetail = rocketDetail;
    }


    @Override
    public void run() {
        System.out.println("rocketDetail is preparing = " + rocketDetail);
        try {
            Thread.sleep(1_000L);
            countDownLatch.countDown();
            System.out.println("rocketDetail is finished = " + rocketDetail);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
