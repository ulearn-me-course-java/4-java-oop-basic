package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = new Point[]{};
    public void setPoints(Point[] points) {

       this.points = new Point[points.length];
       int i = 0;
        for (Point point : points) {
            this.points[i] = new Point(point.getX(), point.getY());
            i++;
        }
    }

    public void addPoint(Point point) {
        if(point!=null){
            Point[] pointsNew = new Point[points.length+1];
            for (int i=0; i<pointsNew.length; i++){
                if(i!=points.length)
                    pointsNew[i]=points[i];
                else
                    pointsNew[i]=point;
            }
            setPoints(pointsNew);
        }
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x,y);
        if(x!=0 && y!=0){
            Point[] pointsNew = new Point[points.length+1];
            for (int i=0; i<pointsNew.length; i++){
                if(i!=points.length)
                    pointsNew[i]=points[i];
                else
                    pointsNew[i]=point;
            }
            setPoints(pointsNew);
        }
    }


    public double getLength() {
        double result=0;
        for (int i=1; i<points.length; i++){
            result+= points[i-1].getLength(points[i]);
        }
        return result;
    }

}
