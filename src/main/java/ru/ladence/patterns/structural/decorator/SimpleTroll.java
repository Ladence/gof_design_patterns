package ru.ladence.patterns.structural.decorator;

/**
 * Troll with base behaviour
 */
class SimpleTroll implements Troll{
    @Override
    public void doAttack() {
        System.out.println("Troll is trying to grab you");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("Troll is running away");
    }
}
