package ru.ladence.patterns.creational.builder;

/**
 * Cutlet enum
 */
enum Cutlet {
    CHICKEN, BEEF, PORK;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
