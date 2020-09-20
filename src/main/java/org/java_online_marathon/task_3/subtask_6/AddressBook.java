package org.java_online_marathon.task_3.subtask_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AddressBook implements Iterable<NameAddressPair> {
    private NameAddressPair[] addressBook;
    private int counter = 0;

    public AddressBook() {
    }

    public AddressBook(int capacity) {
        addressBook = new NameAddressPair[capacity];
    }

    public boolean create(String firstName, String lastName, String address) {
        addressBook[counter] = new NameAddressPair(new Person(firstName, lastName), address);
        counter++;
        if (addressBook[counter].getAddress().isEmpty()) {
            return false;
        }
        return true;
    }

    public String read(String firstName, String lastName) {
        for (int i = 0; i < addressBook.length; i++) {
            if (addressBook[i].getPerson().getFirstName().equals(firstName) && addressBook[i].getPerson().getLastName().equals(lastName)) {
                return addressBook[i].getAddress();
            }
        }
        return "";
    }

    public boolean update(String firstName, String lastName, String address) {
        for (int i = 0; i < addressBook.length; i++) {
            if (addressBook[i].getPerson().getFirstName().equals(firstName)
                    || addressBook[i].getPerson().getLastName().equals(lastName)
                    || addressBook[i].getAddress().equals(address)) {
                addressBook[i] = new NameAddressPair(new Person(firstName, lastName), address);
            }
        }
        return true;
    }

    public boolean delete(String firstName, String lastName) {
        for (int i = 0; i < addressBook.length; i++) {
            if (addressBook[i].getPerson().getFirstName().equals(firstName) && addressBook[i].getPerson().getLastName().equals(lastName)) {
                ArrayList temp = new ArrayList(Arrays.asList(addressBook));
                temp.remove(i);
                addressBook = (NameAddressPair[]) temp.toArray();
            }
        }
        return true;
    }

    public int size() {
        return addressBook.length;
    }

    public void sortedBy(SortOrder order) {
        System.out.println(order.toString());
    }


    @Override
    public Iterator<NameAddressPair> iterator() {
        return new AddressBook(). new AddressBookIterator();
    }

    private class AddressBookIterator implements Iterator<NameAddressPair> {
        int counter = 0;

        @Override
        public boolean hasNext() {
            if (counter >= addressBook.length) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public NameAddressPair next() {
            return addressBook[counter++];
        }
    }
}
