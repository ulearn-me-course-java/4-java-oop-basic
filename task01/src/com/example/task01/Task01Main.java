package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(10,10);
        Point p2 = new Point(10,5);

        System.out.println("Point 1:");
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);

        System.out.println(p2.distance(p1));

        p2.flip();
        System.out.println(p2);
    }
}
