package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(7, 5);
        Point p2 = new Point(8,6);

        p1.flip();
        p2.flip();
        System.out.println("Distance between point's = " + p1.distance(p2));
        System.out.println("Point 1:");
        p1.print();
        //System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p1.toString());
        //System.out.println(p2);
    }
}
