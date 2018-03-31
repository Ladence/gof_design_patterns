package ru.ladence.patterns.creational.abstractfactory;

/**
 * Product-typed class. Hierarchy : Army
 */
class ElfArmy implements Army {
    private static final String DESCRIPTION = "This is Elf Army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
