package com.dmadevthread.lesson25.task;

import java.util.Queue;

import static com.dmadevthread.lesson25.task.RandomUtil.*;

public class ConsumerThread implements Runnable {
    //consumer будет получать бесконечно значения из нашего списка
    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();

                    System.out.println("consumer get value: " + removedValue +". Size:"+ list.size());
                } else {
                    System.out.println("consumer is waiting, list is empty");
                }
                try {
//                    int random = getRandom(80);
                    int random =80;
                    System.out.println("consumer wait:" + random);
//                    list.notifyAll();
                    list.wait(random);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
