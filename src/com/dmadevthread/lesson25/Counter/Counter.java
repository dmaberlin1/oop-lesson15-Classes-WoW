package com.dmadevthread.lesson25.Counter;
//можно не создавать конструктор ,  по дефолту инт значения будут ноль, что нас более чем устраивает

public class Counter {
    private int count;
    private static String description;

    public synchronized static void init(){
        synchronized (Counter.class){
            if(description==null){
                description="Test description";
            }
        }

    }



    public void increment() {
        synchronized (this){
            count++;
        }
    }
    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
