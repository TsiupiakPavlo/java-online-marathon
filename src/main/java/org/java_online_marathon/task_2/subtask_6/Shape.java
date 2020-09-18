package org.java_online_marathon.task_2.subtask_6;

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
