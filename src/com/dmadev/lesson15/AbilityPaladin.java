package com.dmadev.lesson15;

public interface AbilityPaladin {
    String ABILITY = "";
    String CLASS = "";


//    default void printInfo(){
//        System.out.println(getInfo(ABILITY,CLASS));
//    }

    private String getInfo(String ABILITY, String CLASS){
       return CLASS+"with special Ability:" +ABILITY;
    }
}






