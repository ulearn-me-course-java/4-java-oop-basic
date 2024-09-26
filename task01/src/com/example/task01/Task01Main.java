package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 45);
        Point p2 = new Point(78, 12);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(8, 6);

        System.out.println("Point 1:");
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);
        p1.flip();
        p2.flip();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.distance(p4));
    }
}
