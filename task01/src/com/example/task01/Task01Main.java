package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 2);

        Point p2 = new Point(5, 6);


        System.out.println("Point 1:");
        System.out.println(p1);
        System.out.println("Point 2:");
        System.out.println(p2.distance(p1));

        System.out.println(p2);
    }
}
