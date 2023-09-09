package com.dmadev.lesson15;

public interface AbilityPaladin {
    String ABILITY = "Prayer";
    String CLASS = "Paladin";


    default void printInfo(){
        System.out.println(getInfo(ABILITY,CLASS));
    }

    void resurrection(String value);

    private String getInfo(String ABILITY, String CLASS){
       return CLASS+" with special Ability: " +ABILITY;
    }
}






