package com.example.task05;
import javax.sound.sampled.Line;
public class Task05Main {
    public static void main(String[] args)
    {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(1, 0);

        PolygonalLine line = new PolygonalLine();
        line.setPoints(new Point[]{p1, p2, p3});

        System.out.println(line.getLength());
    }
}
