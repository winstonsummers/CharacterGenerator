package com.company.CharacterClasses;

import com.company.Races.Elf;

public class ElfMage extends Elf {
    public ElfMage(String name) {
        super(name);
        String[] abilitiesToAdd = {"Cast Spells", "Read Scrolls", "Detect Magic"};
        this.setAbilities(abilitiesToAdd);
    }
}
