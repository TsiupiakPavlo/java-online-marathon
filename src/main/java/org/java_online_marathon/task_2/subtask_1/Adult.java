package org.java_online_marathon.task_2.subtask_1;

public class Adult extends Person {
    private String passportNumber;

    public Adult() {
    }

    public Adult(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Adult(int age, String healthInfo, String name) {
        super(age, healthInfo, name);
    }

    public Adult(int age, String healthInfo, String name, String passportNumber) {
        super(age, healthInfo, name);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
