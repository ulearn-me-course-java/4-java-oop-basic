package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(27,31);
        Point p2 = new Point(30,27);

        System.out.println("Point 1:");
        System.out.println(p1);
        System.out.println("Point 2:");
        System.out.println(p2);
        p2.flip();
        System.out.println(p2.distance(p1));
        System.out.println(p2);
    }
}
