package org.java_online_marathon.task_2.subtask_1;

public class Child extends Person {
    private String childIDNumber;

    public Child() {
    }

    public Child(String childIDNumber) {
        this.childIDNumber = childIDNumber;
    }

    public Child(int age, String healthInfo, String name) {
        super(age, healthInfo, name);
    }

    public Child(int age, String healthInfo, String name, String childIDNumber) {
        super(age, healthInfo, name);
        this.childIDNumber = childIDNumber;
    }

    public String getChildIDNumber() {
        return childIDNumber;
    }

    public void setChildIDNumber(String childIDNumber) {
        this.childIDNumber = childIDNumber;
    }
}
