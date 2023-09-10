package com.dmadev.lesson15;

import com.dmadev.lesson15.weapon.*;

public class WeaponRunner {
    public static void main(String[] args) {
        Warlock<Wand> darkWarlockWithWand = new Warlock<Wand>("Dark Warlock with Wand","Human Warlock",10);
        darkWarlockWithWand.setWeapon(new Wand());

        Paladin<Sword> holyPaladinWithSword = new Paladin<Sword>("Holy Paladin With Sword","Elf Paladin",12);
        Paladin<Axe> holyPaladinWithAxe = new Paladin<>("Holy Paladin With Axe","Dwarf Paladin",11);
        Paladin<GreaterMagicWand> holyPaladinWithWand = new Paladin<>("Holy Paladin With Wand","Elf Paladin",7);
        holyPaladinWithSword.setWeapon(new Sword());
        holyPaladinWithAxe.setWeapon(new Axe());
        printWeaponDamage(holyPaladinWithAxe);
        printWeaponDamageMeele(holyPaladinWithAxe);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero){
        System.out.println(hero.getWeapon());
    }
    public static  void printWeaponDamageWithWildsCards(Hero<? extends Weapon> hero){
        System.out.println(hero.getWeapon());
    }
    public static  void printWeaponDamageMeele(Hero<? super Axe > hero){
        hero.setWeapon(new Axe());
        System.out.println(hero.getWeapon());
    }
}
