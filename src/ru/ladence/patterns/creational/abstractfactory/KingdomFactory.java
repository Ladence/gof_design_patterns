package ru.ladence.patterns.creational.abstractfactory;

/**
 * Kingdom abstract - factory
 */
interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
