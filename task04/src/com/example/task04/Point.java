package com.example.task04;

public class Point {

        final int x;
        final int y;

        Point(int X, int Y) {
            x = X;
            y = Y;
        }

        Point flip() {
           return new Point(-y, -x);
        }

        double distance(Point point) {
            return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        void print() {
            String pointToString = String.format("(%d, %d)", x, y);
            System.out.println(pointToString);
        }


}
