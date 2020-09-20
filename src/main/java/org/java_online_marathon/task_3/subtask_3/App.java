package org.java_online_marathon.task_3.subtask_3;

public class App {
    private static AddStrategy addStrategy;

    public static void execute(int a, int b, Strategy strategy) {
        double result = strategy.doOperation(a, b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        execute(6, 3, addStrategy);
    }
}
