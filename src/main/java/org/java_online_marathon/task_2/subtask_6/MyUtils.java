package org.java_online_marathon.task_2.subtask_6;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {
        List<Shape> shapeList = new ArrayList<>();

        if (shapes == null) {
            return shapeList;
        }

        if (shapes.isEmpty()) {
            return shapeList;
        }

        if (shapes.size() == 1) {
            return shapes;
        }

        Circle circle = new Circle("0", 0);
        Rectangle rectangle = new Rectangle("0", 0, 0);

//        for (int i = 0; i < shapes.size(); i++) {
//            if (shapes.get(i).getClass().getName().equals("Circle")) {
//                circle = shapes.stream().map(Circle::getArea).mapToInt(Double::parseDouble).max();
//            }
//            if (shapes.get(i).getClass().getName().equals("Rectangle")) {
//                rectangle = shapes.stream().map(Rectangle::getArea).mapToInt(Double::parseDouble).max();
//            }
//        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getClass().getName().equals("Circle")) {
                if (shapes.get(i).getArea() > circle.getArea()) {
                    circle = (Circle) shapes.get(i);
                }
            }
            if (shapes.get(i).getClass().getName().equals("Rectangle")) {
                if (shapes.get(i).getArea() > rectangle.getArea()) {
                    rectangle = (Rectangle) shapes.get(i);
                }
            }
        }

        shapeList.add(circle);
        shapeList.add(rectangle);

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getClass().getName().equals("Circle")) {
                if (shapes.get(i).getArea() == circle.getArea()) {
                    shapeList.add(shapes.get(i));
                }
            }
            if (shapes.get(i).getClass().getName().equals("Rectangle")) {
                if (shapes.get(i).getArea() == rectangle.getArea()) {
                    shapeList.add(shapes.get(i));
                }
            }
        }
        return shapeList;
    }
}
