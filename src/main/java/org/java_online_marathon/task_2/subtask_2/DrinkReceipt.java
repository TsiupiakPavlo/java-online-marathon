package org.java_online_marathon.task_2.subtask_2;

public interface DrinkReceipt {
    String getName();

    DrinkReceipt addComponent(String componentName, int componentCount);
}
