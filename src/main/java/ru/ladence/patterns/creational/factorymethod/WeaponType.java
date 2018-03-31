package ru.ladence.patterns.creational.factorymethod;

/**
 * Product type enum
 */
enum WeaponType {
    AXE, SWORD, BOW, DAGGER;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
