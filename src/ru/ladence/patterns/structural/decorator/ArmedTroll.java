package ru.ladence.patterns.structural.decorator;

/**
 * Troll with extended behaviour
 */
class ArmedTroll implements Troll{
    private Troll decoratedTroll;


    ArmedTroll(Troll decoratedTroll) {
        this.decoratedTroll = decoratedTroll;
    }

    @Override
    public void doAttack() {
        decoratedTroll.doAttack();
        System.out.println("Troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return 10 + decoratedTroll.getAttackPower();
    }

    @Override
    public void fleeBattle() {
        decoratedTroll.fleeBattle();
    }
}
