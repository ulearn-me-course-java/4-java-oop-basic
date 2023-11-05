package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 45;
        Point p2 = new Point(78, 12);

        // flip test
        System.out.println("Point 1:" + p1);
        p1.flip();
        System.out.println("Point 1:" + p1);
        p1.flip();
        System.out.println("Point 1:" + p1);

        // distence test
        // sqrt(68^2 + 33^2) = sqrt(4624 + 1089) = sqrt(5713) = 75,58438992278762
        double distance_1 = p1.distance(p2);
        double distance_2 = p2.distance(p1);
        System.out.println(distance_1);
        System.out.println(distance_2);


    }
}
