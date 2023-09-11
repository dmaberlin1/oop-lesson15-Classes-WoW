package com.dmadev.lesson20.exception.Tasks;

public class Task3{
    public static void main(String[] args) {
        unsafeRuntime();


        //        try {
//            unsafe();
//        } catch (DmadevException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            e.printStackTrace();
//        }

    }
    public static void unsafe() throws DmadevException {
        throw new DmadevException(new RuntimeException("runtime exception"));
    }
    public static void unsafeRuntime()  {
        throw new DmaDevRuntimeException("**-runtime exception from class RuntimeException");
    }
}
