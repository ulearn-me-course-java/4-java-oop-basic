package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(-2,-3), new Point(4,6));
        Point point = new Point(2,3);

        System.out.println(line);
        System.out.println("getP1: " + line.getP1().distance(point));
        System.out.println("getP2: " + line.getP2().distance(point));
        System.out.println("getP1P2: " + line.getP1().distance(line.getP2()));
        System.out.println("CollCheck: " + line.collinearCheck(new Point(2,3)));
    }
}
