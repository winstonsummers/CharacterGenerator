package com.company.CharacterClasses;

import com.company.Races.Dwarf;

public class DwarfCleric extends Dwarf {
    public DwarfCleric(String name) {
        super(name);
        String[] abilitiesToAdd = {"Turn Undead", "Lay on of Hands"};
        this.setAbilities(abilitiesToAdd);
    }

}
