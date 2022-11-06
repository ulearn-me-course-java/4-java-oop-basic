package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        double[] p1 = {2534.343909, 123.358176};
        double[] p2 = {1093.723481, 453.09511543};
        final double p1toP2 = new Point(p1[0], p1[1]).getLength(new Point(p2[0], p2[1]));
        final double expected = 1477.874712820937;
    }
}
