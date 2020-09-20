package org.java_online_marathon.task_2.subtask_4;

import java.util.*;

public class MyUtils {

    private Employee employee;

    public List<Employee> largestEmployees(List<Employee> workers) {
        List<Employee> list = new ArrayList<>();

        if (workers == null || workers.isEmpty()) {
            return list;
        }

        if (workers.size() == 1) {
            return workers;
        }

        Employee expEmployee = new Employee();
        Employee payEmployee = new Employee();
        Manager expManager = new Manager();
        Manager payManager = new Manager();

        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i) instanceof Employee) {
                if (workers.get(i).getExperience() > expEmployee.getExperience()) {
                    expEmployee = workers.get(i);
                }
                if (workers.get(i).getPayment().doubleValue() > payEmployee.getPayment().doubleValue()) {
                    payEmployee = workers.get(i);
                }
            }
            if (workers.get(i) instanceof Manager) {
                if (workers.get(i).getExperience() > expManager.getExperience()) {
                    expManager = (Manager) workers.get(i);
                }
                if (workers.get(i).getPayment().doubleValue() > payManager.getPayment().doubleValue()) {
                    payManager = (Manager) workers.get(i);
                }
            }
        }

        list.add(expEmployee);
        list.add(payEmployee);
        list.add(expManager);
        list.add(payManager);

        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i) instanceof Employee) {
                if (workers.get(i).getExperience() == expEmployee.getExperience()) {
                    list.add(workers.get(i));
                }
                if (workers.get(i).getPayment().doubleValue() == payEmployee.getPayment().doubleValue()) {
                    list.add(workers.get(i));
                }
            }
            if (workers.get(i) instanceof Manager) {
                if (workers.get(i).getExperience() == expManager.getExperience()) {
                    list.add(workers.get(i));
                }
                if (workers.get(i).getPayment().doubleValue() == payManager.getPayment().doubleValue()) {
                    list.add(workers.get(i));
                }
            }
        }

        TreeSet<Employee> employees = new TreeSet<>(list);
        List<Employee> result = new ArrayList<>(employees);

        return result;
    }
}