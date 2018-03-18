package ru.ladence.patterns.creational.factorymethod;

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
