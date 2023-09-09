package com.dmadev.lesson15;

public final class Warlock extends Mage implements AbilityWarlock {

    public Warlock(String name,String type,int damage) {
        super(name,type, damage);
    }

    @Override
    public void printInfo() {
        AbilityWarlock.super.printInfo();
        System.out.println(" to summon medium pet <10> damned honor");
        System.out.println(" to summon tiny pet <5> damned honor");
        System.out.println();
    }

    @Override
    public void summoning(String petName) {
        System.out.println(getName()+" summoning "+'*'+petName+" is summoning with damned honor"+"........");
        makeDuration(500);
        System.out.println("*** the dark magic continued** **");
        makeDuration(1500);
        System.out.println('*'+petName+": I am destroyed your enemies!!!");;
        makeDuration();
    }
}
