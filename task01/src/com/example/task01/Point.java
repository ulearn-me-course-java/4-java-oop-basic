
package com.example.task01;

public class Point {
    int x;
    int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point) {
        int dx = x - point.x;
        int dy = y - point.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    //@Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
