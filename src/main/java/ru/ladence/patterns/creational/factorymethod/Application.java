package ru.ladence.patterns.creational.factorymethod;

/**
 *
 * The Factory Method is a creational design pattern which uses factory methods to deal with the
 * problem of creating objects without specifying the exact class of object that will be created.
 * This is done by creating objects via calling a factory method either specified in an interface
 * and implemented by child classes, or implemented in a base class and optionally overridden by
 * derived classes—rather than by calling a constructor.
 * <p>
 * In this Factory Method example we have an interface ({@link Blacksmith}) with a method for
 * creating objects ({@link Blacksmith#manufactureWeapon}). The concrete subclasses (
 * {@link OrcBlacksmith}, {@link ElfBlacksmith}) then override the method to produce objects of
 * their liking.
 *
 */
public class Application {
    public static void main(String[] args) {
        Blacksmith orcBlacksmith = new OrcBlacksmith();
        System.out.println(orcBlacksmith.manufactureWeapon(WeaponType.AXE));
    }
}
