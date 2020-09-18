package org.java_online_marathon.task_2.subtask_4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ivan", 10, new BigDecimal(3000)));
        list.add(new Manager("Petro", 9, new BigDecimal(3000), 1.5));
        list.add(new Employee("Stepan", 8, new BigDecimal(4000)));
        list.add(new Employee("Andriy", 7, new BigDecimal(3500)));
        list.add(new Employee("Ihor", 5, new BigDecimal(4500)));
        list.add(new Manager("Vasyl", 8, new BigDecimal(2000), 2));

        MyUtils utils = new MyUtils();
        System.out.println(utils.largestEmployees(list));
    }
}
