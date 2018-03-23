package ru.ladence.patterns.behavioral.observer;

/**
 *
 * The Observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any
 * state changes, usually by calling one of their methods. It is mainly used to implement
 * distributed event handling systems. The Observer pattern is also a key part in the familiar
 * model–view–controller (MVC) architectural pattern. The Observer pattern is implemented in
 * numerous programming libraries and systems, including almost all GUI toolkits.
 */
class Application {
    public static void main(String[] args) {
        Warlord warlord = new Warlord();

        Private privateSoldier = new Private();
        Sergeant sergeantSoldier = new Sergeant();

        warlord.addObserver(privateSoldier);
        warlord.addObserver(sergeantSoldier);

        warlord.updateCommand(ArmyActionsEnum.COMBAT_TRAINING);
    }
}
