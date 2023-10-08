package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Line line = new Line(new Point(1, 2), new Point(1, 0));

        System.out.println(line);
        System.out.println(line.isCollinearLine(new Point(1, 1)));
    }
}
