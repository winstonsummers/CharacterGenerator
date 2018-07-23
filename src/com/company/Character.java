package com.company;

import java.util.Random;

abstract public class Character {

    private String name;

    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;

    Random random = new Random();

    protected Character(String name){
        this.name = name;
        this.strength = random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +3;
        this.dexterity = random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +3;
        this.constitution = random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +3;
        this.intelligence = random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +3;
        this.wisdom = random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +3;
        this.charisma = random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +3;
    }

    void getStats() {
        System.out.println("Name "+this.name+"\nStrength " + this.strength + "\nDexterity " + this.dexterity + "\nConstitution " + this.constitution + "\nIntelligence " + this.intelligence + "\nWisdom " + this.wisdom + "\nCharisma " + this.charisma);
        drinkOfChoice();
    }

    public abstract void drinkOfChoice();
}
