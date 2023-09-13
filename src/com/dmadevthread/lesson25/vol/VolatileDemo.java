package com.dmadevthread.lesson25.vol;

public class VolatileDemo {
    /**
     * по умолчанию false
     * volatile - отключение оптимизации, например хранение в кеше процессора
     */
    private static volatile boolean flag;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("still false");
            }
        });
        thread1.start();
        Thread.sleep(5L);
        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("flag is set");

        });
        thread2.start();
    }
}
