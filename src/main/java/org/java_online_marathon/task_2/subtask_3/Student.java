package org.java_online_marathon.task_2.subtask_3;

public class Student extends Person {
    private String studyPlace;
    private int studyYears;

    public Student() {
    }

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public void setStudyPlace(String studyPlace) {
        this.studyPlace = studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }

    public void setStudyYears(int studyYears) {
        this.studyYears = studyYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (getStudyYears() != student.getStudyYears()) return false;
        return getStudyPlace() != null ? getStudyPlace().equals(student.getStudyPlace()) : student.getStudyPlace() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getStudyPlace() != null ? getStudyPlace().hashCode() : 0);
        result = 31 * result + getStudyYears();
        return result;
    }
}
