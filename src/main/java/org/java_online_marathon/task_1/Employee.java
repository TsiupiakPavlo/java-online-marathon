package org.java_online_marathon.task_1;

public class Employee {
    private String fullName;
    private float salary;

    public Employee() {
    }

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.fullName = "Pavlo Tsiupiak";
        emp1.salary = 1000;

        Employee emp2 = new Employee();
        emp2.fullName = "Vitalii Horod";
        emp2.salary = 500;

        String employeesInfo = "[";

        Employee[] employees = {emp1, emp2};

        for (int i = 0; i < employees.length; i++) {
            employeesInfo += String.format("{fullName: \"%s\", salary: %.1f}, ", employees[i].fullName, employees[i].salary);
        }
        employeesInfo = employeesInfo.substring(0, employeesInfo.length() - 2);
        employeesInfo += "]";
    }

}
