package com.dmadev.lesson27.task;

import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String regex="[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";
        String input="dmaberlin77@gmail.com";
        String input1="1dmaberlin77@gmail.com";
        System.out.println(Pattern.matches(regex,input));
        System.out.println(Pattern.matches(regex,input1));
    }
}
