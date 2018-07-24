package com.company.Races;

import com.company.Character;

public class Elf extends Character {
    public Elf(String name) {
        super(name + " The Elf");
        this.dexterity += 2;
        this.intelligence += 2;
        String[] abilitiesToAdd = {"Find Hidden Door", "Listen at Door"};
        this.setAbilities(abilitiesToAdd);
    }

    public void drinkOfChoice() {
        System.out.println("Drink of Choice:");
        System.out.println("Only the finest Elven wine");
    }

}
