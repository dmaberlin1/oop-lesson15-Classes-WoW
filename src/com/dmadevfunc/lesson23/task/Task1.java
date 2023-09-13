package com.dmadevfunc.lesson23.task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {
    private static final String VOWELS="яуыаеиоэюё";
    public static void main(String[] args) throws IOException {
        Path file=Path.of("resources","fileBase1.txt");
        try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()){
                    String word=scanner.next();
                     if(word.toLowerCase().length()>1){
                         char firstSymbol=word.charAt(0);
                    if(VOWELS.indexOf(Character.toLowerCase(firstSymbol))!=-1){
                        System.out.println(word);
                    }
                     }
                }
        }
    }
}
