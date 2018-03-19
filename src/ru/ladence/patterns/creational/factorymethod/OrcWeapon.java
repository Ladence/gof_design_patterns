package ru.ladence.patterns.creational.factorymethod;

/**
 * Concrete product type 2
 */
class OrcWeapon implements Weapon{
    private WeaponType type;

    OrcWeapon(WeaponType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "OrcWeapon{" +
                "type=" + type +
                '}';
    }

    @Override
    public WeaponType getWeaponType() {
        return type;
    }
}
