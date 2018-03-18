package ru.ladence.patterns.creational.builder;

/**
 * Vegetable enum
 */
enum Vegetable {
    TOMATO, ONION, CUCUMBER;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
