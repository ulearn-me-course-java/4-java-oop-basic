package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point pt1 = new Point(0,5);
        Point pt2 = new Point(5,0);
        Point pt3 = new Point(2,3);
        Line line = new Line(pt1, pt2);

        System.out.println(line.toString());
        if (line.isCollinearLine(pt3)) {
            System.out.println("Точка " + pt3 + " лежит на прямой.");
        } else {
            System.out.println("Точка " + pt3 + " не лежит на прямой.");
        }


    }
}
