package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(3, -3));
        Point point = new Point(5, -5);
        System.out.println("Is " + point + " collinear to " + line + " = " + line.isCollinearLine(point));
    }
}
