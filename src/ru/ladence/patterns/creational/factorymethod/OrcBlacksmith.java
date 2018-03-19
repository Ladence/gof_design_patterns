package ru.ladence.patterns.creational.factorymethod;

/**
 * Concrete Creator type 2
 */
class OrcBlacksmith implements Blacksmith{
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return new OrcWeapon(type);
    }
}
