package ru.ladence.patterns.structural.decorator;

/**
 * The Decorator pattern is a more flexible alternative to subclassing. The Decorator class
 * implements the same interface as the target and uses aggregation to "decorate" calls to the
 * target. Using the Decorator pattern it is possible to change the behavior of the class during
 * runtime.
 */
class Application {
    public static void main(String[] args) {
        Troll troll = new SimpleTroll();
        troll.doAttack();
        System.out.println(troll.getAttackPower());
        troll.fleeBattle();

        troll = new ArmedTroll(troll);
        troll.doAttack();

    }
}
