package ru.ladence.patterns.creational.factorymethod;

/**
 * Concrete creator type 1
 */
class ElfBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return new ElfWeapon(type);
    }
}
