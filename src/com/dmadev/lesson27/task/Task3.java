package com.dmadev.lesson27.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String regex="(p\\s.+?>)(.+?</p>)";
        String input="<p>text text </p> </br> <p> <div> <p id=\"p1\"> text2 </p> </div> ";
        System.out.println(input.replaceAll(regex, "<p>$2"));


    }
}
