package com.company;

import com.company.CharacterClasses.Cleric;
import com.company.CharacterClasses.Mage;
import com.company.Races.Dwarf;
import com.company.Races.Elf;
public class Main {

    public static void main(String[] args) {
	    System.out.println("Character Creator\n");

	    Character john = new Elf("John", Mage);
        Character jill = new Dwarf("Jill", Cleric);

        john.getStats();
        jill.getStats();
    }
}
