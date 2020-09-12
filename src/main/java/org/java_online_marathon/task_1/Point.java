package org.java_online_marathon.task_1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXYPair() {
        int arr[] = {x, y};
        return arr;
    }

    public double distance(int x, int y) {
        return Math.sqrt( Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2) );
    }

    public double distance(Point point) {
        return Math.sqrt( Math.pow(point.x-this.x, 2) + Math.pow(point.y-this.y, 2) );
    }

    public double distance() {
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
    }
}
