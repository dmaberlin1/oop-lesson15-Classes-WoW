package com.dmadev.lesson15;

public final class Paladin extends Warrior implements AbilityPaladin{
    public Paladin(String name, String type,int damage) {
        super(name,type, damage);
    }




    @Override
    public void printInfo() {
        AbilityPaladin.super.printInfo();
        System.out.println(" to resurrect heroes need < 5 > holy honor");
        System.out.println(" to resurrect NPC need < 2 > holy honor");
        System.out.println();
    }

    @Override
    public void resurrection(String npcName) {
        System.out.println(npcName+ " is resurrected with Holy Honor");
    }
}
