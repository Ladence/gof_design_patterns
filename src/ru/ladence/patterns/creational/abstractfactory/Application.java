package ru.ladence.patterns.creational.abstractfactory;

/**
 *
 * The Abstract Factory pattern provides a way to encapsulate a group of individual factories that have a common theme
 * without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of
 * the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part
 * of the theme. The client does not know (or care) which concrete objects it gets from each of these internal
 * factories, since it uses only the generic interfaces of their products. This pattern separates the details of
 * implementation of a set of objects from their general usage and relies on object composition, as object creation is
 * implemented in methods exposed in the factory interface.
 * <p>
 * The essence of the Abstract Factory pattern is a factory interface ({@link KingdomFactory}) and its implementations (
 * {@link ElfKingdomFactory}, {@link OrcKingdomFactory}). The example uses both concrete implementations to create a
 * king, a castle and an army.
 *
 */
public class Application {
    private King king;
    private Castle castle;
    private Army army;

    private void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setArmy(factory.createArmy());
        setCastle(factory.createCastle());
    }

    private void setKing(King king) {
        this.king = king;
    }

    private void setCastle(Castle castle) {
        this.castle = castle;
    }

    private void setArmy(Army army) {
        this.army = army;
    }

    /**
     * Enum for different types of kingdom
     */
    private enum KingdomType {
        ELF, ORC
    }

    /**
     * Factory method to create factory for concrete-type objects
     * @param type type of objects
     * @return abstract factory for products this type
     */
    private KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF: return new ElfKingdomFactory();
            case ORC: return new OrcKingdomFactory();
            default: throw new IllegalArgumentException("Kingdom type not supported");
        }
    }

    public static void main(String[] args) {
        Application application = new Application();

        application.createKingdom(application.makeFactory(KingdomType.ELF));
        application.printInfo();

        application.createKingdom(application.makeFactory(KingdomType.ORC));
        application.printInfo();
    }


    private King getKing() {
        return king;
    }

    private Castle getCastle() {
        return castle;
    }

    private Army getArmy() {
        return army;
    }

    private void printInfo() {
        System.out.println(getArmy().getDescription());
        System.out.println(getKing().getDescription());
        System.out.println(getCastle().getDescription());
    }
}
