package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(3, 3));
        System.out.println("line: " + line);

        Point p1 = line.getP1();
        System.out.println("p1 =" + p1);

        Point p3 = new Point(0, 0);
        System.out.println(line.isCollinearLine(p3));
    }
}
