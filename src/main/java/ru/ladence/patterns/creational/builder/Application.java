package ru.ladence.patterns.creational.builder;

/**
 *
 * The intention of the Builder pattern is to find a solution to the telescoping constructor
 * anti-pattern. The telescoping constructor anti-pattern occurs when the increase of object
 * constructor parameter combination leads to an exponential list of constructors. Instead of using
 * numerous constructors, the builder pattern uses another object, a builder, that receives each
 * initialization parameter step by step and then returns the resulting constructed object at once.
 * <p>
 * The Builder pattern has another benefit. It can be used for objects that contain flat data (html
 * code, SQL query, X.509 certificate...), that is to say, data that can't be easily edited. This
 * type of data cannot be edited step by step and must be edited at once. The best way to construct
 * such an object is to use a builder class.
 * <p>
 * In this example we have the Builder pattern variation as described by Joshua Bloch in Effective
 * Java 2nd Edition.
 * <p>
 */
public class Application {
    public static void main(String[] args) {
        Burger chickenCheeseBurgerWithTomatos = new Burger.Builder(Bread.WHITE, Cutlet.CHICKEN).withSauce(Sauce.CHEESY)
                                                .withVegetable(Vegetable.TOMATO).build();


        Burger cheepChickenBurger = new Burger.Builder(Bread.BLACK, Cutlet.CHICKEN).build();

        System.out.println(chickenCheeseBurgerWithTomatos);
        System.out.println(cheepChickenBurger);
    }
}
