package com.dmadev.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    public static void main(String[] args) {
        String phoneNumber = "mark +375 (39) 789-21-66 " +
                "mark2  +375 (13) 828-22-13 " +
                "mark3 +375 (25) 858-21-25 " +
                "mark4 +375 (79) 878-16-13 end";
//        String regex = "(\\+375\\s)?(\\(\\d{2}\\))?(\\s)?\\d{3}(-)?\\d{2}(-)?\\d{2}";
        String regex = "(?:\\+375)?\\s?\\((?<code>\\d{2})\\)\\s?(\\d{3})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);
//            matcher.appendReplacement(stringBuilder, gr1 + " " + gr2 + " " + gr3);
            matcher.appendReplacement(stringBuilder, "$2 $3 $4");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);
        System.out.println(phoneNumber.replaceAll(regex,"$3 - $3 - $4 |"));
    }
}
