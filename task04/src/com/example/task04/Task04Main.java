package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(2, 2));
        System.out.printf("%b", line.isCollinearLine(new Point(1, 1)));
    }
}
