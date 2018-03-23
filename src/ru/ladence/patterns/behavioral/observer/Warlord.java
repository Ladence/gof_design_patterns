package ru.ladence.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Warlord {
    private ArmyActionsEnum currentActionInCommand;
    private final List<ArmyObserver> observers;

    Warlord() {
        currentActionInCommand = ArmyActionsEnum.REST;
        observers = new ArrayList<>();
    }

    void addObserver(ArmyObserver observer) {
        observers.add(observer);
    }

    void removeObserver(ArmyObserver observer) {
        observers.remove(observer);
    }

    void updateCommand(ArmyActionsEnum action) {
        currentActionInCommand = action;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ArmyObserver observer : observers) {
            observer.doCommand(currentActionInCommand);
        }
    }
}
