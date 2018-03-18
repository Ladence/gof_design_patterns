package ru.ladence.patterns.creational.abstractfactory;

/**
 * Product-typed class. Hierarchy : King
 */
class OrcKing implements King{
    private static final String DESCRIPTION = "This is king of orcs";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
