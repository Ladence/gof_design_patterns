package ru.ladence.patterns.creational.abstractfactory;


/**
 * Product-typed class. Hierarchy : King
 */
class ElfKing implements King {
    private static final String DESCRIPTION = "King of elves";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
