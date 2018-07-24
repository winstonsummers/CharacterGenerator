package com.company.Races;

import com.company.Character;

public class Dwarf extends Character {
    public Dwarf(String name, Object charClassToBe){
        super(name + " The Dwarf", charClassToBe);
        this.strength += 2;
        this.constitution += 2;
    }

    public void drinkOfChoice() {
        System.out.println("Drink of Choice:");
        System.out.println("Great big barrels of Rainbow Ripply\n");
    }

    public void listAbilities() {
        System.out.println("something");
    }

    public void listWeapons() {
        System.out.println("something");
    }
}
