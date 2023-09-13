package com.dmadevthread.lesson26.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        threadPool.scheduleAtFixedRate(()-> System.out.println("OK from shedule"),3L,4L,TimeUnit.SECONDS);
//        threadPool.shutdown();
//        threadPool.awaitTermination(5L,TimeUnit.SECONDS);
    }

    private static void test() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2_000L);
            System.out.println("it's callable");
            return 1;
        });

        System.out.println("future.get() = " + future.get());
        threadPool.shutdown();
//        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        threadPool.awaitTermination(1L, TimeUnit.SECONDS);
        System.out.println("main end");
    }
}
