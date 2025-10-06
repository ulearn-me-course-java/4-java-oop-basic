package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();

        line.addPoint(0 ,0);
        line.addPoint(3 ,5);
        line.addPoint(7 ,2);

        System.out.println("Ломаная: " + line.toString());
        System.out.println("Количество точек: " + line.getNumberOfPoints());
        System.out.println("Длина: " + line.getLength());

        Point[] pointsArray = {new Point(1, 1), new Point(4, 5), new Point(7, 1)};
        line.setPoints(pointsArray);

        System.out.println("После setPoints: " + line.toString());
        System.out.println("Новая длина: " + line.getLength());
    }
}
