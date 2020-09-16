package org.java_online_marathon.task_2.subtask_4;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private int experience;
    private BigDecimal basePayment;

    public Employee() {
        this.basePayment = new BigDecimal(0);
    }

    public Employee(String name, int experience, BigDecimal basePayment) {
        this.name = name;
        this.experience = experience;
        this.basePayment = basePayment;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public BigDecimal getPayment() {
        return basePayment;
    }

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0) {
            res = Integer.compare(experience, o.experience);
        }
        if (res == 0) {
            res = Double.compare(basePayment.doubleValue(), o.basePayment.doubleValue());
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getExperience() == employee.getExperience() &&
                getName().equals(employee.getName()) &&
                Objects.equals(basePayment, employee.basePayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getExperience(), basePayment);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", basePayment=" + basePayment +
                '}';
    }
}
