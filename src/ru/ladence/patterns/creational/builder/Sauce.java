package ru.ladence.patterns.creational.builder;

/**
 * Sauce enum
 */
enum Sauce {
    BBQ, CHEESY, KETCHUP, MAYO;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
