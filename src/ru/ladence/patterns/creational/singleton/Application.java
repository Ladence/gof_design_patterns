package ru.ladence.patterns.creational.singleton;

public class Application {
    public static void main(String[] args) {
        EnumKing king = EnumKing.INSTANCE;
        EnumKing king2 = EnumKing.INSTANCE;
    }
}
