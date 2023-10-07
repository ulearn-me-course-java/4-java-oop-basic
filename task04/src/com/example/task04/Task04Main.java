package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(5,5);
        Line line = new Line(p1,p2);

        Point pointLine = new Point(6,6);
        System.out.println(line.isCollinearLine(pointLine));

    }
}
