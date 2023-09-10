package com.dmadev.lesson15;

import com.dmadev.lesson15.weapon.Axe;
import com.dmadev.lesson15.weapon.Sword;
import com.dmadev.lesson15.weapon.Wand;

public class WeaponRunner {
    public static void main(String[] args) {
        Warlock<Wand> darkWarlockWithWand = new Warlock<Wand>("Dark Warlock with Wand","Human Warlock",10);
        darkWarlockWithWand.setWeapon(new Wand());

        Paladin<Sword> holyPaladinWithSword = new Paladin<Sword>("Holy Paladin With Sword","Elf Paladin",12);
        Paladin<Axe> holyPaladinWithAxe = new Paladin<>("Holy Paladin With Axe","Dwarf Paladin",11);
        holyPaladinWithSword.setWeapon(new Sword());
        holyPaladinWithAxe.setWeapon(new Axe());
    }
}
