package com.dmadev.lesson15;



import com.dmadev.lesson15.weapon.MeeleWeapon;
import com.dmadev.lesson15.weapon.Weapon;

public final class Paladin<T extends Weapon> extends Warrior<T> implements AbilityPaladin{
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
