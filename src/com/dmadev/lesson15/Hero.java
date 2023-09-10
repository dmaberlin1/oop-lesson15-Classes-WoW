package com.dmadev.lesson15;

public abstract class Hero<T> implements Duration {
    private String name;
    private String type;
    private int damage;
    private T weapon;
    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);

    @Override
    public void makeDuration(int duration) {
        Duration.super.makeDuration(duration);
    }
    @Override
    public void makeDuration() {
        Duration.super.makeDuration(500);
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public Hero(String name, String type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }
}
