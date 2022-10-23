package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 3), new Point(3, 9));
        if (line.isCollinearLine(new Point(2, 6))) {
            System.out.println("Belongs to");
        }
        else {
            System.out.println("Does not belong to");
        }
    }
}

class Point {
    final int x;
    final int y;

    public Point(int p1, int p2) {
        x = p1;
        y = p2;
    }

    double distance(Point point) {
        int x1 = x, y1 = y;
        int x2 = point.x, y2 = point.y;
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

class Line {
    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2) {
        point1 = p1;
        point2 = p2;
    }

    public Point getP1() {
        return point1;
    }

    public Point getP2() {
        return point2;
    }

    public String toString() {
        return  "(" + point1.x + ", " + point1.y + ")" + "; " +
                "(" + point2.x + ", " + point2.y + ")";
    }

    public boolean isCollinearLine(Point p) {
        int x = p.x, y = p.y;
        int x1 = point1.x, y1 = point1.y;
        int x2 = point2.x, y2 = point2.y;

        if (Math.abs((double)(x - x1) / (x2 - x1) - (double)(y - y1) / (y2 - y1)) <= 0.00001 &&
           (double)(x - x1) / (x2 - x1) >= 0.0 &&  (double)(y - y1) / (y2 - y1) <= 1.0){
            return true;
        }
        else {
            return false;
        }
    }
}
