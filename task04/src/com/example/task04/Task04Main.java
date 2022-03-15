package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Line line = new Line(new Point(4, 3), new Point(7, 5));
        System.out.println(line.isCollinearLine(new Point(1, 1)));
    }
}
