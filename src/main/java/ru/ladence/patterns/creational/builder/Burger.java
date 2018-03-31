package ru.ladence.patterns.creational.builder;

class Burger {
    private final Bread bread;
    private final Cutlet cutlet;
    private final Sauce sauce;
    private final Vegetable vegetable;

    /**
     * Constructor for builder class
     * @param builder burger builder
     */
    private Burger(Builder builder) {
        this.bread = builder.bread;
        this.cutlet = builder.cutlet;
        this.sauce = builder.sauce;
        this.vegetable = builder.vegetable;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(bread.toString()).append(" ").append(cutlet.toString());

        if (sauce != null) {
            stringBuilder.append(" with sauce : ").append(sauce);
        }
        if (vegetable != null) {
            stringBuilder.append(" with vegetable : ").append(vegetable);
        }

        return stringBuilder.toString();
    }

    static class Builder {
        private final Bread bread;
        private final Cutlet cutlet;
        private Sauce sauce;
        private Vegetable vegetable;

        Builder(Bread bread, Cutlet cutlet) {
            this.bread = bread;
            this.cutlet = cutlet;
        }

        Builder withSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        Builder withVegetable(Vegetable vegetable) {
            this.vegetable = vegetable;
            return this;
        }

        Burger build() {
            return new Burger(this);
        }
    }
}


