package com.dmadev.lesson19.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> listNums= new ArrayList<>(Arrays.asList(1,2,100,6,7,11,13,20));
        List<Integer> result = removeEven(listNums);
        System.out.println(result);
    }

    private static List<Integer> removeEven(List<Integer> list){
        List<Integer>result=new ArrayList<>();
        for (Integer value : list) {
            if(value%2 !=0){
                result.add(value);
            }
        }
        return result;
    }
}
