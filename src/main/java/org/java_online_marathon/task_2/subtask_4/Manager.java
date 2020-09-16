package org.java_online_marathon.task_2.subtask_4;

import java.math.BigDecimal;

public class Manager extends Employee {
    private double coefficient;

    public Manager() {
        super();
    }

    public Manager(String name, int experience, BigDecimal basePayment, double coefficient) {
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public BigDecimal getPayment() {
        //return BigDecimal.valueOf(super.getExperience()).multiply(super.getPayment());
        return super.getPayment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return Double.compare(manager.getCoefficient(), getCoefficient()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getCoefficient());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + super.getName() + '\'' +
                ", experience=" + super.getExperience() +
                ", basePayment=" + super.getPayment() +
                ", coefficient=" + coefficient +
                '}';
    }
}
