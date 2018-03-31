package ru.ladence.patterns.creational.singleton;

import java.util.EnumMap;

/**
 * Enum based singleton implementation. Effective Java 2nd Edition (Joshua Bloch) p. 18
 *
 * This implementation is thread safe, however adding any other method and its thread safety
 * is developers responsibility.
 */
enum EnumKing  {
    INSTANCE;

    private EnumKing() {

    }

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
