package ru.ladence.patterns.behavioral.observer;

import org.apache.log4j.PropertyConfigurator;

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
        String log4jConfPath = "./src/main/resources/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        Warlord warlord = new Warlord();

        Private privateSoldier = new Private();
        Sergeant sergeantSoldier = new Sergeant();

        warlord.addObserver(privateSoldier);
        warlord.addObserver(sergeantSoldier);

        warlord.updateCommand(ArmyActionsEnum.COMBAT_TRAINING);
    }
}
