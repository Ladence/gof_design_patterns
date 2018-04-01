package ru.ladence.patterns.structural.flyweight;

import org.apache.log4j.Logger;

public class ManaPotion implements Potion {
    private static final Logger LOGGER = Logger.getLogger(ManaPotion.class);
    @Override
    public void drink() {
        LOGGER.debug("Your mana has been successfully restored!");
    }
}
