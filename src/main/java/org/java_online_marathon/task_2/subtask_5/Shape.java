package org.java_online_marathon.task_2.subtask_5;

public abstract class Shape {
    double width;

    public Shape(double width) {
        this.width = width;
    }

    public abstract double getPerimeter();

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
