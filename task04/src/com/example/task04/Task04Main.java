package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point start = new Point(1, 1);
        Point end = new Point(3, 5);
        Point point = new Point(4, 7);

        Line line = new Line(start, end);
        boolean result = line.isCollinearLine(point);

        System.out.println(result);
    }
}
