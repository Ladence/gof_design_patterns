package ru.ladence.patterns.creational.factorymethod;

/**
 * Concrete product type 1
 */
class ElfWeapon implements Weapon {
    private WeaponType type;

    ElfWeapon(WeaponType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ElfWeapon{" +
                "type=" + type +
                '}';
    }

    @Override
    public WeaponType getWeaponType() {
        return type;
    }
}
