package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(10,45);
        Point p2 = new Point(78,12);

        Line line = new Line(p1, p2);

        System.out.println(line.toString());
    }
}
