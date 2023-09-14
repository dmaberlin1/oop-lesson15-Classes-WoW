package com.dmadevthread.lesson26.task;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }
            threadExecutor.submit(() -> {
                Thread.sleep(seconds *1000L);
                System.out.println(
                        String.format("Поток `%s` спал `%d` секунд", Thread.currentThread().getName(), seconds));
                return seconds;
            });
        }
        threadExecutor.shutdown();
        threadExecutor.awaitTermination(3L, TimeUnit.MINUTES);

    }
}
