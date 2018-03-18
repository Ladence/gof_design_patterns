package ru.ladence.patterns.creational.factorymethod;

class OrcBlacksmith implements Blacksmith{
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return new OrcWeapon(type);
    }
}
