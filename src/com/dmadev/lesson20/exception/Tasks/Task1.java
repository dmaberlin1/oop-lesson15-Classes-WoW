package com.dmadev.lesson20.exception.Tasks;

public class Task1 {
    public static void main(String[] args) {
        String value=null;
        String value1="test111";
//        unsafeRuntimeException(value);

        try {
        unsafeRuntimeException(value);
        }catch (RuntimeException exception){
            exception.printStackTrace();
}
        System.out.println("main end");
    }

    public static int unsafe(String value) throws NullPointerException{
        if(value ==null){
            throw new NullPointerException();
        }
        return value.length();
    }

    public static int unsafeRuntimeException(String value){
        if(value ==null){
            throw new NullPointerException("***-value is null");
        }
        System.out.println("unsafeRuntimeException return: "+value);
        return value.length();
    }

}
