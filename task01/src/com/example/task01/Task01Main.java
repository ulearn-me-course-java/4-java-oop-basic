package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(5,-7);


        Point p2 = new Point(78,12);

        System.out.println("Point 1:");
        p1.print();
        p1.flip();
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);
    }
}
