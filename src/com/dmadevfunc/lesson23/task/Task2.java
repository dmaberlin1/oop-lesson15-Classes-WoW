package com.dmadevfunc.lesson23.task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "fileBase1.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev=null;
            if(scanner.hasNext()){
               prev=scanner.next();
            }
            while (scanner.hasNext()){
                //while начинает крутится уже с словом в prev
                String current=scanner.next();
                if(isEqualLastSymbolAndFirstSymbol(prev,current)){
                    System.out.println(prev+" "+ current);
                }
                prev=current;
//                После сравнения и вывода, переменная prev обновляется и присваивается значение current.
//                Это делается для того, чтобы на следующей итерации цикла prev содержало значение предыдущего слова,
//                        которое было считано.
            }

        }

    }

    private static boolean isEqualLastSymbolAndFirstSymbol(String prev, String current) {
        return prev.charAt(prev.length()-1)==current.charAt(0);
    }
}


