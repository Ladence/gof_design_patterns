package ru.ladence.patterns.creational.factorymethod;


class ElfBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return new ElfWeapon(type);
    }
}
