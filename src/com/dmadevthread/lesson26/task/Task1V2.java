package com.dmadevthread.lesson26.task;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1V2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadExecutor = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }
            threadExecutor.submit(() -> {
                Integer counter = threadLocal.get();
                threadLocal.set(counter == null ? 1 : ++counter);
                System.out.println(
                        String.format("Поток `%s`, задач: `%d`", Thread.currentThread().getName(), threadLocal.get())
                );

                Thread.sleep(seconds * 1000L);
                System.out.println(
                        String.format("Поток `%s` спал `%d` секунд", Thread.currentThread().getName(), seconds));
                return seconds;
            });
        }
        threadExecutor.shutdown();
        threadExecutor.awaitTermination(3L, TimeUnit.MINUTES);

    }
}
