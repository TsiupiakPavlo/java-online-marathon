package org.java_online_marathon.task_2.subtask_3;

public class Worker extends Person {
    private String workPosition;
    private int experienceYears;

    public Worker() {
    }

    public Worker(String name, String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (getExperienceYears() != worker.getExperienceYears()) return false;
        return getWorkPosition() != null ? getWorkPosition().equals(worker.getWorkPosition()) : worker.getWorkPosition() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getWorkPosition() != null ? getWorkPosition().hashCode() : 0);
        result = 31 * result + getExperienceYears();
        return result;
    }
}
