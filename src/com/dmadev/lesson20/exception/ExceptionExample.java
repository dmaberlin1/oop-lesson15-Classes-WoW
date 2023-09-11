package com.dmadev.lesson20.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample
{
    public static void main(String[] args) {
        System.out.println("main start");
        try{
//            unsafe(-10);
            System.out.println(finallyTest());
            unsafe(5);
//        }catch (FileNotFoundException | TimeoutException exception){
        }catch (TimeoutException exception){
            exception.printStackTrace();
        }
        catch (RuntimeException exception){
            exception.printStackTrace();
        }
        catch (Exception exception){
            //handle exception
            exception.printStackTrace();
        }

        finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }

    public static int finallyTest(){
        try {
            return 2;
        }catch (Throwable throwable){
            return 3;
        }
        finally {
            return 4;
        }
    }
    public static void tryAndFinnaly() throws FileNotFoundException, ClassNotFoundException, TimeoutException {
        try {
            unsafe(5);
        }finally {
            System.out.println("finally from tryAndFinnaly");
        }
    }
    public static void unsafe(int value) throws FileNotFoundException, TimeoutException ,ClassNotFoundException{
        System.out.println("unsafe start");
        if(value>0){
            throw new FileNotFoundException();
        }
        if(value>1000){
            throw new ClassNotFoundException();
        }
        System.out.println("unsafe end");
        //code
    }
    public static void unsafeWithRuntime(int value) {
        System.out.println("unsafe start");
        if(value>0){
            throw new RuntimeException();
        } else if (value < -1000) {
            throw new RuntimeException();
        }

        System.out.println("unsafe end");
        //code
    }
}
