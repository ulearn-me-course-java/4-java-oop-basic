package com.example.task04;


public class Task04Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(2,1);
        Line line1 = new Line(point1, point2 );
        System.out.println(line1.toString());
    }
}
