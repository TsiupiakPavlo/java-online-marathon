package org.java_online_marathon.task_2.subtask_5;

import java.util.List;

public class MyUtils {
    public double sumPerimeter(List<Shape> firures) {
        for (Shape shape : firures) {
            if (shape == null) {
                return 0;
            }
        }
        return firures.stream().map(Shape::getPerimeter).mapToDouble(Double::doubleValue).sum();
    }
}
