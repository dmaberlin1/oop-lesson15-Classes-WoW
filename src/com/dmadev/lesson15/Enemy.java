package com.dmadev.lesson15;

public class Enemy implements Mortal{
    private int health;
    private String name;


    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }



    public void takeDamage(int damage){
//        this.health-=health>damage ? damage :health;
        if(isAlive() && health<=damage){
            health=0;

        }else{
        this.health -= Math.min(health, damage);
        System.out.println('*'+name+'('+health+')'+" taken damage " +damage+"     *health("+health+')');
        }
    }

    @Override
    public boolean isAlive() {
        if(health<=0){
            System.out.println('*'+name+" is defined by heroes!!!");
            return false;
        }
        return true;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
