package ru.ladence.patterns.behavioral.observer;

enum ArmyActionsEnum {
    COMBAT_TRAINING, REST, PARADE, MEAL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
