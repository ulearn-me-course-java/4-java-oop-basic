package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> points= new ArrayList<>();

    public PolygonalLine(Point... points){
        setPoints(points);
    }
    public void setPoints(Point[] points) {
        for(Point p:points){
            this.points.add(new Point(p.getX(),p.getY()));
        }

    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(),point.getY()));
    }

    public void addPoint(double x, double y) {
        Point point=new Point(x,y);
        addPoint(point);
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size()-1; i++) {
            length += points.get(i).getLength(points.get(i+1));
        }
        return length;
    }

}
