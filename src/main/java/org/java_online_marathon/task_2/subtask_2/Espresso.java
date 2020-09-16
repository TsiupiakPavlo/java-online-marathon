package org.java_online_marathon.task_2.subtask_2;

import java.util.Map;

public class Espresso extends Caffee {
    public Espresso() {
        addComponent("Water", 50);
        addComponent("Arabica", 20);
    }

    public Espresso(String name, int rating) {
        super(name, rating);
        addComponent("Water", 50);
        addComponent("Arabica", 20);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        return super.makeDrink();
    }
}
