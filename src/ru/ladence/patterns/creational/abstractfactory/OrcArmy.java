package ru.ladence.patterns.creational.abstractfactory;

/**
 * Product typed class. Hierarchy : Army
 */
class OrcArmy implements Army {
    private static final String DESCRIPTION = "This is orc army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
