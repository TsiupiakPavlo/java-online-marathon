package org.java_online_marathon.task_3.subtask_4;

public enum LineType {
    SOLID, DOTTED, DASHED, DOUBLE;

    public static String drawLine(LineType lineType) {
        return "The line is " + lineType.toString().toLowerCase() + " type.";
    }
}
