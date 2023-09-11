package com.dmadev.lesson20.exception.Tasks;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Task6 {
    private static final Map<Integer,Throwable> EXCEPTIONS=Map.of(
            0,new RuntimeException(),
            1,new FileNotFoundException(),
            2,new IndexOutOfBoundsException(),
            3,new AbstractMethodError()
    );
    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(4));
        }catch (FileNotFoundException exception){
            System.out.println(1);
            System.err.println(exception);
        }catch (RuntimeException exception){
            System.out.println(0);
            System.out.println(exception);
        }

        catch (Throwable e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void unsafe(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new DmaDevRuntimeException("not found"));
        throw exception;
    }
}
