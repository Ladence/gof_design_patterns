package ru.ladence.patterns.creational.factorymethod;

public class Application {
    public static void main(String[] args) {
        Blacksmith orcBlacksmith = new OrcBlacksmith();
        System.out.println(orcBlacksmith.manufactureWeapon(WeaponType.AXE));

    }
}
