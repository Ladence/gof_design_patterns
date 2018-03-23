package ru.ladence.patterns.behavioral.observer;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

class Sergeant implements ArmyObserver {
    private static final Logger logger = Logger.getLogger(Sergeant.class);

    public void doCommand(ArmyActionsEnum action) {
        switch (action) {
            case MEAL:
                logger.debug("Sergeant is eating now");
                break;
            case REST:
                logger.debug("Sergeant is resting now");
                break;
            case PARADE:
                logger.debug("Sergeant is coming up in line now");
                break;
            case COMBAT_TRAINING:
                logger.debug("Sergeant is going to combat training room");
                break;
        }
    }
}
