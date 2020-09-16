package org.java_online_marathon.task_2.subtask_2;

import java.util.Map;

public class Cappuccino extends Caffee {
    public Cappuccino() {
        addComponent("Water", 100);
        addComponent("Arabica", 20);
        addComponent("Milk", 50);
    }

    public Cappuccino(String name, int rating) {
        super(name, rating);
        addComponent("Water", 100);
        addComponent("Arabica", 20);
        addComponent("Milk", 50);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        return super.makeDrink();
    }
}
