package org.java_online_marathon.task_2.subtask_3;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    public List<Person> maxDuration(List<Person> persons) {
        List<Person> personList = new ArrayList<>();

        if (persons.isEmpty()) {
            return personList;
        }

        if (persons.size() == 1) {
            return personList;
        }

        Worker maxExpWorker = new Worker();
        Student maxExpStudent = new Student();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getClass().getName().equals("Worker")) {
                Worker temp = (Worker) persons.get(i);
                if (temp.getExperienceYears() > maxExpWorker.getExperienceYears()) {
                    maxExpWorker = temp;
                }
            }
            if (persons.get(i).getClass().getName().equals("Student")) {
                Student temp = (Student) persons.get(i);
                if (temp.getStudyYears() > maxExpStudent.getStudyYears()) {
                    maxExpStudent = temp;
                }
            }
        }

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getClass().getName().equals("Worker")) {
                Worker temp = (Worker) persons.get(i);
                if (maxExpWorker.getExperienceYears() == temp.getExperienceYears()) {
                    personList.add(persons.get(i));
                }
            }
            if (persons.get(i).getClass().getName().equals("Student")) {
                Student temp = (Student) persons.get(i);
                if (maxExpStudent.getStudyYears() == temp.getStudyYears()) {
                    personList.add(persons.get(i));
                }
            }
        }

        personList.add(maxExpWorker);
        personList.add(maxExpStudent);

        return personList;
    }
}
