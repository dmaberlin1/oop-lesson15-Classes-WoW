package com.dmadev.lesson20.exception.Tasks;

public class Task5 {

    public static void main(String[] args)  {
try {
    catchCustomException();

}catch (DmaDevRuntimeException exception){
    System.err.println(exception);
}
    }

    public static void catchCustomException(){
        try {
            unsafe();
        }catch (RuntimeException exception){
            System.out.println("catch in CustomException method");
            throw new DmaDevRuntimeException(exception);
        }
    }

    public static void unsafe(){
        throw new RuntimeException("Opps - from *unsafe");
    }
}
