package com.dmadevfunc.lesson21;

import java.sql.SQLOutput;
import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
//        //старая версия исполнения лямбда фу-ций через анонимные классы
//        Comparator<Integer> comparator=new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        };

        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(50,100));
    }

//    private static class IntegerComparator implements Comparator<Integer>{
//
//        @Override
//
//       (Integer o1, Integer o2)-> {
//            return Integer.compare(o1,o2);
//       }
    }



