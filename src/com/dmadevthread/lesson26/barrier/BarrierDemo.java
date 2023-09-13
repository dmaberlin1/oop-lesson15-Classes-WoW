package com.dmadevthread.lesson26.barrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length,
                () -> System.out.println("Run ! ! ! CyclicBarrier getting 5"));
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Arrays.stream(RocketDetail.values())
                .map(detail->new RocketDetailRunnable(detail,cyclicBarrier))
                .forEach(threadPool::submit);
        threadPool.shutdown();
        threadPool.awaitTermination(30, TimeUnit.SECONDS);
    }
}
