package com.dmadev.lesson15;
import com.dmadev.lesson15.weapon.MeeleWeapon;

public  class  Warrior<T extends MeeleWeapon> extends Hero<T>{

    public Warrior(String name,String type,int damage) {
        super(name, type, damage);
    }

    public void roar(){
        makeDuration();
        System.out.println('*'+getName()+ ": A-A-T-A-A-A-A-CK WITH ME!!!!!!");
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        makeDuration();
        System.out.println('*'+getName()+" Attack with sword " + enemy.getName());
        enemy.takeDamage(getDamage());
//        System.out.println('*'+enemy.getName()+'('+enemy.getHealth()+')'+" - "+getDamage());
    }
}
