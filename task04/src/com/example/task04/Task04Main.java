package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(3, 2);
        System.out.println("Point 1:");
        System.out.println(p1);
        System.out.println("Point 2:");
        System.out.println(p2);
        System.out.println("Point 3:");
        System.out.println(p3);
        Line line = new Line(p1, p2);
        System.out.println("Point p3 is collinear with the line: " + line.isCollinearLine(p3));
    }
}
