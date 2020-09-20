package org.java_online_marathon.task_3.subtask_5;

public enum ClientType {
    NEW(1), SILVER(12), GOLD(30), PLATINUM(60);

    private int months;

    ClientType(int months) {
        this.months = months;
    }

    public double discount(ClientType clientType) {
        if (clientType.equals("NEW")) {
            return 1.0;
        }
        if (clientType.equals("SILVER")) {
            return (100 - clientType.months * 0.25) / 100;
        }
        if (clientType.equals("GOLD")) {
            return (100 - clientType.months * 0.3) / 100;
        }
        if (clientType.equals("PLATINUM")) {
            return (100 - clientType.months * 0.35) / 100;
        }
        return 1.0;
    }
}
