package com.example.task05;

import java.security.SecureRandom;
import java.util.Random;

public class Task05Main {
    public static void main(String[] args) {

        final int pointsCount = 50;
        Random random = new SecureRandom();
        Point[] points = new Point[pointsCount];
        double[] doubles = random.doubles(pointsCount * 2, -1000, 1000).toArray();
        double expectedLength = 0;
        for (int i = 0; i < pointsCount; i++) {
            double x = doubles[i * 2];
            double y = doubles[i * 2 + 1];
            points[i] = new Point(x, y);
            if (i > 0) {
                double x2 = points[i - 1].getX();
                double y2 = points[i - 1].getY();
                expectedLength += Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
            }
        }
        PolygonalLine line = new PolygonalLine();
        for (int i = 0; i < pointsCount; i++) {
            line.addPoint(points[i]);
        }
        double actualLength = line.getLength();



        System.out.println(line.getLength() + " " + expectedLength);
        //Double.compare(line.getLength(), 20);
    }
}