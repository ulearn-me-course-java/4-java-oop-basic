package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 45);
        Point p2 = new Point(78, 12);

        System.out.println("Point 1:");
        System.out.println(p1);
        System.out.println("Point 2:");
        System.out.println(p2);

        double distance = p1.distance(p2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);

        p1.flip();
        System.out.println("Flipped Point 1:");
        System.out.println(p1);

        distance = p1.distance(p2);
        System.out.println("Distance between Flipped Point 1 and Point 2: " + distance);
    }
}
