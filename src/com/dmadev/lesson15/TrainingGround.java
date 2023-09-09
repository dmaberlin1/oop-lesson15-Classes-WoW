package com.dmadev.lesson15;

import com.dmadev.lesson15.Warlock.Golem;

public class TrainingGround {
    public static void main(String[] args) {
        Paladin DebrungoHoly = new Paladin("DebrungoHoly","Elf Paladin",30);
        Warlock DarkMagius = new Warlock("DarkMagius","Gnome Warlock",20);
        Paladin TempleMan=new Paladin("TempleMan","Drenei Paladin",9);
        Golem MysticalGolem=new Golem("Mystical Golem",4);
        Warlock.Golem MysticGolem=new Warlock.Golem("Mystic Golem",2);

        Enemy forgottenSoul = new Enemy(100, "Forgotten Soul");

        DarkMagius.support();
        DarkMagius.summoning("Bloody Princess");
        DebrungoHoly.roar();
        attackEnemy(forgottenSoul,DebrungoHoly,DarkMagius);
        attackEnemyWhenAlive(forgottenSoul,TempleMan);
    }


    public static void attackEnemy(Enemy enemy,Hero... heroes){
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
    public static void attackEnemyWhenAlive(Enemy enemy,Hero... heroes){
        while (enemy.isAlive()){
        for (Hero hero : heroes) {
            if(enemy.isAlive()){
            hero.attackEnemy(enemy);
            }
        }
        }
    }

}
