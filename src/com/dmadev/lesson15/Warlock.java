package com.dmadev.lesson15;

import com.dmadev.lesson15.weapon.MagicWeapon;

public final class Warlock<T extends MagicWeapon> extends Mage<T> implements AbilityWarlock {
    private Succubus succubus;

    public Warlock(String name,String type,int damage) {
        super(name,type, damage);
        this.succubus=new Succubus("Queen of Succubus",2);
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


    @Override
    public void attackEnemy(Enemy enemy) {
//    super.attackEnemy();
        makeDuration();
        System.out.println('*'+getName()+" Attack with magic ");
        succubus.attackEnemy(enemy);
//        System.out.println('*'+enemy.getName()+'('+enemy.getHealth()+')'+" - "+getDamage());
    }


    private  class Succubus{
        private String name;
        private int damage;

        public Succubus(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
        public void attackEnemy(Enemy enemy){
            System.out.println(name+" and "+Warlock.this.getName() +" get allies damage");
            enemy.takeDamage(damage+Warlock.this.getDamage());
            makeDuration();
        }
    }

    public static class Golem{
        private String name;
        private int damage;

        public  Golem(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
        public void attackEnemy(Enemy enemy){
            System.out.println(name+ " get allies damage");
            enemy.takeDamage(damage);
        }
    }
}
