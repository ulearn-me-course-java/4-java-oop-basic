package com.example.task01;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int temp = -1 * x;
        x = -1 * y;
        y = temp;
    }

    double distance(Point point) throws Exception {
        if (point == null)
            throw new Exception("Point null reference");

        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
