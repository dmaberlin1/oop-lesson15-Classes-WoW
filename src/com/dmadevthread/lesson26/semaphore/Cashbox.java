package com.dmadevthread.lesson26.semaphore;

public class Cashbox {
    private int id;
    private static int generator;

    public Cashbox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}
