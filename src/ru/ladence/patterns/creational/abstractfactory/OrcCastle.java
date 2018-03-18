package ru.ladence.patterns.creational.abstractfactory;

/**
 * Product-typed class. Hierarchy : Castle
 */
class OrcCastle implements Castle {
    private static final String DESCRIPTION = "This is castle of orcs";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
