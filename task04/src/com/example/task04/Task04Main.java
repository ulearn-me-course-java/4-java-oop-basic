package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 1);
        Point p2 = new Point(5, 3);
        Line line = new Line(p1, p2);

        Point p3 = new Point(4, 2);
        line.isCollinearLine(p3);


    }
}
