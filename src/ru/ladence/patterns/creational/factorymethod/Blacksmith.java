package ru.ladence.patterns.creational.factorymethod;

/**
 * Blacksmith interface (Creator notion from GoF)
 */
interface Blacksmith {
    Weapon manufactureWeapon(WeaponType type);
}
