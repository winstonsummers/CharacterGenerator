package com.company;

import com.company.CharacterClasses.DwarfCleric;
import com.company.CharacterClasses.ElfMage;
import com.company.Races.Dwarf;
import com.company.Races.Elf;
public class Main {

    public static void main(String[] args) {
	    System.out.println("Character Creator\n");

	    Character john = new ElfMage("John");
        Character jill = new DwarfCleric("Jill");

        john.getStats();
        jill.getStats();
    }
}
