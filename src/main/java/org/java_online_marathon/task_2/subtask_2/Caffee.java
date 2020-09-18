package org.java_online_marathon.task_2.subtask_2;

import java.util.HashMap;
import java.util.Map;

public class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
    private String name;
    private int rating;
    private Map<String, Integer> ingredients = new HashMap<>();

    public Caffee() {
        addComponent("Water", 100);
        addComponent("Arabica", 20);
    }

    public Caffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
        addComponent("Water", 100);
        addComponent("Arabica", 20);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        return ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName, componentCount);
        return this;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caffee)) return false;

        Caffee caffee = (Caffee) o;

        if (getRating() != caffee.getRating()) return false;
        return getName().equals(caffee.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getRating();
        return result;
    }
}
