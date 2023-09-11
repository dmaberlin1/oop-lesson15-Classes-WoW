package com.dmadev.lesson20.exception.Tasks;

public class DmadevException extends Exception{
    public DmadevException(String message) {
        super(message);
    }

    public DmadevException(Throwable cause) {
        super(cause);
    }
}
