package ru.ladence.patterns.structural.flyweight;

import org.apache.log4j.Logger;

public class HealingPotion implements Potion {
    private static final Logger LOGGER = Logger.getLogger(HealingPotion.class);
    @Override
    public void drink() {
        LOGGER.debug("You feel healed.");
    }
}
