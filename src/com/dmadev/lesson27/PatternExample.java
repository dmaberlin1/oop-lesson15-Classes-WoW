package com.dmadev.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String phoneNumber="+375 (29) 898-12-13";
        String phoneNumberFalse="8981213";
        String regex ="(\\+375\\s)?(\\(\\d{2}\\))?(\\s)?\\d{3}(-)?\\d{2}(-)?\\d{2}";
        Pattern pattern = Pattern.compile("(\\+375\\s)?(\\(\\d{2}\\))?(\\s)?\\d{3}(-)?\\d{2}(-)?\\d{2}");
        Matcher matcher = pattern.matcher(phoneNumber);
        Matcher matcher2 = pattern.matcher(phoneNumberFalse);
        System.out.println(matcher.matches());
        System.out.println(matcher2.matches());
        System.out.println(Pattern.matches(regex, phoneNumberFalse));

    }
}
