package org.java_online_marathon.task_2.subtask_5;

public class Rectang extends Shape {
    private double height;

    public Rectang(double height, double width) {
        super(width);
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * height + 2 * width;
    }
}
