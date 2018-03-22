package ru.ladence.patterns.creational.singleton;

/**
 * Eagerly initialized singleton
 */
class King {
    private static final King INSTANCE = new King();

    /**
     * Private constructor so nobody can instantiate the class
     */
    private King() {

    }

    /**
     *
     * @return singleton instance
     */
    static King getInstance() {
        return INSTANCE;
    }
}
