package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(45);
        Point p2 = new Point();
        p2.setX(78);
        p2.setY(12);

        System.out.println("Point 1:");
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);
    }
}
