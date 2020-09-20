package org.java_online_marathon.task_3.subtask_6;

public class NameAddressPair {
    private Person person;
    private String address;

    public NameAddressPair(Person person, String address) {
        this.person = person;
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public String getAddress() {
        return address;
    }
}
