package com.dmadev.lesson20.exception.Tasks;

public class Task2 {

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};

    try {
        for (int i = 0; i <= values.length; i++) {
            System.out.println(values[i]);
        }
    }catch (ArrayIndexOutOfBoundsException exception){
        System.err.println("Catch");
        exception.printStackTrace();
    }
    finally {
        System.out.println("try catch is completed, the results are written to the text document");
    }


    }


}
