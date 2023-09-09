package com.dmadev.lesson15;

public abstract class Hero implements Duration {
    private String name;
    private String type;
    private int damage;
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

    public String getType() {
        return type;
    }

    public Hero(String name, String type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }
}
