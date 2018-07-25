package com.company.Races;

import com.company.Character;

public class Dwarf extends Character {
    public Dwarf(String name){
        super(name + " The Dwarf");
        this.strength += 2;
        this.constitution += 2;
        String[] abilitiesToAdd = {"Stone Cunning", "Listen at Door"};
        this.setAbilities(abilitiesToAdd);
    }

    public void drinkOfChoice() {
        System.out.print("Drink of Choice: ");
        System.out.println("Great big barrels of Rainbow Ripply");
    }


}
