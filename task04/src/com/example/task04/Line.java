package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public String toString() {
        String line = "p1(" + String.valueOf(p1.x) + ";" + String.valueOf(p1.y) + ") "
                + "p2(" + String.valueOf(p2.x) + ";" + String.valueOf(p2.y) + ")";
        return line;
    }
    public boolean isCollinearLine(Point p) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        int gcd = GCD(dx, dy);
        dx /= gcd;
        dy /= gcd;
        int dx1 = p.x - p1.x;
        int dy1 = p.y - p1.y;
        if (dx1 % dx == 0 && dy1 % dy == 0)
            return true;
        else
            return false;
    }
    private static int GCD(int i1, int i2) {
        while (i1 != 0 && i2 != 0)
        {
            if (i1 > i2)
                i1 %= i2;
            else
                i2 %= i1;
        }

        return i1 | i2;
    }

}
