package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 2), new Point(4, 2));

        System.out.println(line.isCollinearLine(new Point(2, 2)));
    }
}
