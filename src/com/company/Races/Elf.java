package com.company.Races;

import com.company.Character;

public class Elf extends Character {
    public Elf(String name, Object charClassToBe) {
        super(name + " The Elf", charClassToBe);
        this.dexterity += 2;
        this.intelligence += 2;
    }

    public void drinkOfChoice() {
        System.out.println("Drink of Choice:");
        System.out.println("Only the finest Elven wine\n");
    }

    public void listAbilities() {
        System.out.println("something");
    }

    public void listWeapons() {
        System.out.println("something");
    }
}
