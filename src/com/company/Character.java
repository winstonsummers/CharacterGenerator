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
        int total = 0;
        int numOfRolls = 0;
        while (numOfRolls < 3){
            int roll = random.nextInt(6) +1;
            if (roll >= 2){
                total = total+roll;
                ++numOfRolls;
            }
        }

        return total;
    }

    protected Character(String name){
        this.name = name;
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
        System.out.print("Abilities ");
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
