package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 12;
        p1.y = 35;
        Point p2 = new Point();
        p2.x = 48;
        p2.y = 42;

        System.out.println("Point 1:");
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);
    }
}
