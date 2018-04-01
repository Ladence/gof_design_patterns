package ru.ladence.patterns.structural.flyweight;

import org.apache.log4j.Logger;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {
    private final Map<PotionType, Potion> potions;
    private static final Logger LOGGER = Logger.getLogger(PotionFactory.class);

    public enum PotionType {
        HEAL, MANA
    }

    public PotionFactory() {
        potions = new EnumMap<>(PotionType.class);
    }

    public Potion createPotion(PotionType type) {
        Potion potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEAL:
                    potion = new HealingPotion();
                    potions.put(PotionType.HEAL, potion);
                    break;
                case MANA:
                    potion = new ManaPotion();
                    potions.put(PotionType.MANA, potion);
                    break;
            }
        }
        return potion;
    }

    public static void main(String[] args) {
        PotionFactory potionFactory = new PotionFactory();
        potionFactory.createPotion(PotionType.HEAL).drink();
        potionFactory.createPotion(PotionType.HEAL).drink();
        potionFactory.createPotion(PotionType.MANA).drink();
        potionFactory.createPotion(PotionType.HEAL).drink();
    }
}
