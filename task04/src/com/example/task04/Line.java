package com.example.task04;

import java.text.MessageFormat;

public class Line {
    private Point p1;
    private Point p2;

    public Line(int p1X, int p1Y, int p2X, int p2Y) {
        this.p1 = new Point(p1X, p1Y);
        this.p2 = new Point(p2X, p2Y);
    }

    private class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point() {
            this(0, 0);
        }

        double distance(Point point) {
            int xDif = this.x - point.x;
            int yDif = this.y - point.y;
            return Math.sqrt(xDif * xDif + yDif * yDif);
        }

        public String toString() {
            return String.format("(%d, %d)", x, y);
        }

        void print() {
            System.out.println(this);
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        int vectorX = p2.x - p1.x;
        int vectorY = p2.y - p1.y;

        int vectorToP1X = p.x - p1.x;
        int vectorToP1Y = p.y - p1.y;

        return vectorX * vectorToP1Y - vectorY * vectorToP1X == 0;
    }

    public String toString() {
        return MessageFormat.format("[{0};{1}]", p1, p2);
    }
}
