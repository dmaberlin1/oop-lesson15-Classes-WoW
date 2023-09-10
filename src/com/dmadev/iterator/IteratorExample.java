package com.dmadev.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> myList = List.of(10, 20, 30, 40, 50);
        List<Integer> myArrList = new ArrayList<>(myList);

//        for (int i = 0; i < myList.size(); i++) {
//            Integer integer= myList.get(i);
//        }
        //iter Iterable был создан для коллекций,для итерирования по спискам, очередям , множествам и тд
//        for (Integer integer : myList) {
//            System.out.println(integer);
//        }

        for (Iterator<Integer> myIterator = myArrList.iterator(); myIterator.hasNext();) {
            Integer next = myIterator.next();
            if(next==3 || next==4){
                myIterator.remove();
            }
            System.out.println(next);
        }


//        Iterator<Integer> myIterator = myList.iterator();
//        while (myIterator.hasNext()){
//            Integer next = myIterator.next();
//            System.out.println(next);
//        }
    }
}
