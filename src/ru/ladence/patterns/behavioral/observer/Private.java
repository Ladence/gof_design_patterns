package ru.ladence.patterns.behavioral.observer;


import org.apache.log4j.Logger;

class Private implements ArmyObserver {

    private static final Logger logger =  Logger.getLogger(Private.class);

    public void doCommand(ArmyActionsEnum action) {
        switch (action) {
            case MEAL:
                logger.debug("Private is eating now");
                break;
            case REST:
                logger.debug("Private is resting now");
                break;
            case PARADE:
                logger.debug("Private is coming up in line now");
                break;
            case COMBAT_TRAINING:
                logger.debug("Private is going to combat training room");
                break;
        }
    }
}
