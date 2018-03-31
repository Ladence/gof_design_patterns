package ru.ladence.patterns.creational.abstractfactory;

/**
 * Product-typed class. Hierarchy : Castle
 */
class ElfCastle implements Castle {
    private static final String DESCRIPTION = "This is the elven castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
