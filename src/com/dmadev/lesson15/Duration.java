package com.dmadev.lesson15;

public interface Duration {



    default void makeDuration(int duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            // Обработка исключения, если поток был прерван во время сна
            e.printStackTrace();
        }
    }

    void makeDuration();
}
