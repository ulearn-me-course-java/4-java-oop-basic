package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PolygonalLine {

   private List<Point> points = new ArrayList();

    public void setPoints(Point[] points) {
        this.points.clear();
        for(Point point :points){
            addPoint(point);
        }
    }
    public void addPoint(Point point) {
        points.add(point.clone());
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x,y));
    }

    public double getLength() {
        double lenght = 0;
        for (int i = 0; i < points.size() - 1;i++){
            lenght += (points.get(i)).getLength(points.get(i+1));
        }
        return lenght;
    }

}
