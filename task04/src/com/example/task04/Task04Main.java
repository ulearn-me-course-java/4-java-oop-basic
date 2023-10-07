package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(2, 3));
        Point point = new Point(3, 5);
        boolean isColLine = line.isCollinearLine(point);
    }
}