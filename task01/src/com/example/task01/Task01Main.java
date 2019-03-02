package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 0);
        Point p2 = new Point(1, 0);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.distance(p2));
    }
}
