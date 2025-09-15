package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Line line1 = new Line(new Point(0, 0), new Point(0, 2));
        Point p1 = new Point(-1, -1);
        System.out.println(line1.isCollinearLine(p1));

    }
}
