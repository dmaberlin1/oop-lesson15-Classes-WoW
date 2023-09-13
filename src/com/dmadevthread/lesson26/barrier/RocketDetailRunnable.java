package com.dmadevthread.lesson26.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable{
    private final CyclicBarrier cyclicBarrier;
    private final RocketDetail rocketDetail;

    public RocketDetailRunnable(RocketDetail rocketDetail, CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
        this.rocketDetail = rocketDetail;
    }


    @Override
    public void run() {
        System.out.println("rocketDetail is preparing = " + rocketDetail);
        try {
            Thread.sleep(1_000L);
            System.out.println("rocketDetail is finished and waiting= " + rocketDetail);
            cyclicBarrier.await();
            System.out.println("rocketDetail is used = " + rocketDetail);
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}
