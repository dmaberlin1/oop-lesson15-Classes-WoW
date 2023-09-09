package com.dmadev.lesson15;

public class Mage  extends Hero{


    public Mage(String name,String type,int damage) {
        super(name, type, damage);
    }


    public void support(){
        makeDuration();
        System.out.println('*'+getName()+ ": I am Supporting You! ATTACK!!!");
        makeDuration();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
//        super.attackEnemy();
        makeDuration();
        System.out.println('*'+getName()+" Attack with magic ");
        enemy.takeDamage(getDamage());
//        System.out.println('*'+enemy.getName()+'('+enemy.getHealth()+')'+" - "+getDamage());
    }
}
