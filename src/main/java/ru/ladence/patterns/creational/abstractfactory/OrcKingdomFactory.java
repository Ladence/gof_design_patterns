package ru.ladence.patterns.creational.abstractfactory;

/**
 * Orc-typed abstract - factory
 */
class OrcKingdomFactory implements KingdomFactory{
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
