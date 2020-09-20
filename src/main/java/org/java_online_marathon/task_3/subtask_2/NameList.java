package org.java_online_marathon.task_3.subtask_2;

import java.util.Iterator;

public class NameList {
    private String[] names = {"Mike", "Emily", "Nick", "Patric", "Sara"};

    public Iterator getIterator() {
        return new Iterator() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                if (counter >= names.length) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public Object next() {
                return names[counter++];
            }
        };
    }
}
