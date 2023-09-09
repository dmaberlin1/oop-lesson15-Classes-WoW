package com.dmadev.lesson15;

public interface AbilityWarlock {
    String ABILITY="Summoning Pets";
    String CLASS="Warlock";

    default void printInfo(){

    }

    void summoning(String value);

    private String getInfo(String ABILITY, String CLASS){
        return CLASS+" with special Ability: " +ABILITY;
    }
}
