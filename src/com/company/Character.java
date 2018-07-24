package com.company;

import java.util.Random;

abstract public class Character {

    private String name;
    private Object charClass;

    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;

    private Random random = new Random();
    private int threeDSix() {
        return random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +3;
    }

    protected Character(String name, Object charClassToBe){
        this.name = name;
        this.charClass = charClassToBe;
        this.strength = threeDSix();
        this.dexterity = threeDSix();
        this.constitution = threeDSix();
        this.intelligence = threeDSix();
        this.wisdom = threeDSix();
        this.charisma = threeDSix();
    }

    void getStats() {
        System.out.println("Name "+this.name+"\nStrength " + this.strength + "\nDexterity " + this.dexterity + "\nConstitution " + this.constitution + "\nIntelligence " + this.intelligence + "\nWisdom " + this.wisdom + "\nCharisma " + this.charisma);
        drinkOfChoice();
    }

    public abstract void drinkOfChoice();
}
