package org.java_online_marathon.task_3.subtask_1;

public class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    Pizza() {
    }

    public String getCheese() {
        return cheese;
    }

    public String getMeat() {
        return meat;
    }

    public String getSeafood() {
        return seafood;
    }

    public String getVegetable() {
        return vegetable;
    }

    public String getMushroom() {
        return mushroom;
    }

    public static PizzaBuilder base() {
        return new Pizza().new PizzaBuilder();
    }

    public class PizzaBuilder {
        private PizzaBuilder() {
        }

        public PizzaBuilder addCheese(String cheese) {
            Pizza.this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addMeat(String meat) {
            Pizza.this.meat = meat;
            return this;
        }

        public PizzaBuilder addSeafood(String seafood) {
            Pizza.this.seafood = seafood;
            return this;
        }

        public PizzaBuilder addVegetable(String vegetable) {
            Pizza.this.vegetable = vegetable;
            return this;
        }

        public PizzaBuilder addMushroom(String mushroom) {
            Pizza.this.mushroom = mushroom;
            return this;
        }

        public Pizza build() {
            return Pizza.this;
        }
    }
}

class Oven {
    public static Pizza cook() {

        return new Pizza()
                .base()
                .addCheese("Cheese")
                .addMeat("Meat")
                .addMushroom("Mushroom")
                .build();
    }
}
