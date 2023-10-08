package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);
        Point p2 = new Point(6,2);
        Line line = new Line(p1, p2);
        System.out.println("line: " + line);
        Point point = new Point(2,3);
        System.out.println("point: " + point);
        System.out.println("is collinear: " + line.isCollinearLine(point));
    }
}
