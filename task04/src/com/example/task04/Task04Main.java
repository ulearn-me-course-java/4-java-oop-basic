package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 8);
        Point p2 = new Point(5, 9);
        Point point = new Point(3, 6);

        Line line = new Line(p1, p2);
        boolean result = line.isCollinearLine(point);

        System.out.println(result);
    }
}
