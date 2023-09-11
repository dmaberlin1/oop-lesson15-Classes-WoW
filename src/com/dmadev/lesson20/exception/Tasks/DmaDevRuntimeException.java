package com.dmadev.lesson20.exception.Tasks;

public class DmaDevRuntimeException extends RuntimeException{
    public DmaDevRuntimeException(String message) {
        super(message);
    }

    public DmaDevRuntimeException(Throwable cause) {
        super(cause);
    }
}
