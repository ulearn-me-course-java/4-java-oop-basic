package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(4,4);
        System.out.println("Point a: " + a);
        System.out.println("Point b: " + b);

        Line line = new Line(a,b);
        System.out.println(line);
        Point p = new Point(2, 2);
        boolean isCollinear = line.isCollinearLine(p);
        System.out.println("Is point p collinear with the line: " + isCollinear);
    }
}
