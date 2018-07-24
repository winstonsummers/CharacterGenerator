package com.company;

import java.util.Arrays;
import java.util.Random;

abstract public class Character {

    private String name;

    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;

    private String[] abilities = new String[10];

    private Random random = new Random();
    private int threeDSix() {
        return random.nextInt(6) + random.nextInt(6) + random.nextInt(6) +6;
    }

    protected Character(String name){
        this.name = name;;
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
        System.out.println("Abilities");
        System.out.println(Arrays.toString(abilities));
        System.out.println("\n");
    }
    protected void setAbilities(String[] toAdd){
        int added = 0;
        for(int i = 0; i < abilities.length - 1; ++i) {
            if (abilities[i] == null) {
                abilities[i] = toAdd[added];
                ++added;
            }
            if (added >= toAdd.length) {
                break;
            }
        }
    }
    public abstract void drinkOfChoice();
}
