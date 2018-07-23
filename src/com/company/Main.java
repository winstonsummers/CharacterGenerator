package com.company;


import com.company.Races.Dwarf;
import com.company.Races.Elf;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Character Creator\n");

	    Character john = new Elf("John");
        Character jill = new Dwarf("Jill");

        john.getStats();
        jill.getStats();
    }
}
