package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point start = new Point(2, 4);
        Point end = new Point(7, 1);
        Point point = new Point(5, 2);

        Line line = new Line(start, end);
        boolean result = line.isCollinearLine(point);

        System.out.println(result);

    }
}
