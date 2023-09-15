package com.dmadev.lesson27.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        int value=0xf;
        String regex="0[Xx][0-9a-fA-F]+";
        String input="ssdd 0Xff adasdd 0x12 fsfsf 0XAB faf";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
