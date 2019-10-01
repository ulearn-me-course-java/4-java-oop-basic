package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 45;
        Point p2 = new Point(78, -12);

        System.out.println("Point 1:");
        p1.print();
        p1.flip();
        System.out.println(p1);
        p1.flip();
        System.out.println("distance: "+p1.distance(p2));

        System.out.println("Point 2:");
        p2.print();
        p2.flip();
        System.out.println(p2);
        p2.flip();
        System.out.println("distance: "+p2.distance(p1));
    }
}
