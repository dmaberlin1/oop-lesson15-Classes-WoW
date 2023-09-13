package com.dmadevthread.lesson25;

public class SimpleThread extends Thread{
    @Override
    public void run() {
//        super.run();
        System.out.println("Hello " +getName());
    }
}
