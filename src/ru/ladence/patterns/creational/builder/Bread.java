package ru.ladence.patterns.creational.builder;

/**
 * Bread enum
 */
enum Bread {
    WHITE, BLACK;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
