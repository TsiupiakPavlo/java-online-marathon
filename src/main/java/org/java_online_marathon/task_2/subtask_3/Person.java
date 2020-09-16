package org.java_online_marathon.task_2.subtask_3;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
