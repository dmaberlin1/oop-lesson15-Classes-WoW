package com.dmadevthread.lesson25.task;

import java.util.Queue;

import static com.dmadevthread.lesson25.task.RandomUtil.getRandom;

public class ProducerThread implements Runnable {

private final Queue<Integer> list;
//test
    public ProducerThread(Queue<Integer> list) {
    this.list = list;
}

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if(list.size()<10){
                int random = getRandom();
                list.add(random);
                System.out.println("producer add random value: " + random+". Size "+ list.size());
                }else {
                    System.out.println("producer does nothing");
                }
//                list.notifyAll();
                try {
                    int randomWaitValue = 20;
                    System.out.println("producer waits: " + randomWaitValue);
                    list.wait(randomWaitValue);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
