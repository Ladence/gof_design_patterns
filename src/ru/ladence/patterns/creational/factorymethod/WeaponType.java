package ru.ladence.patterns.creational.factorymethod;

enum WeaponType {
    AXE, SWORD, BOW, DAGGER;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
