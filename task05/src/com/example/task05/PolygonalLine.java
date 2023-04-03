package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    Point[] Points;
    int pointsCount = 0;

    public void setPoints(Point[] points) {
        if(points != null && points.length != 0)
        {
            Point[] newPoints = new Point[points.length];

            for(int i = 0; i < points.length; i++)
            {
                newPoints[i] = new Point(points[i].X,points[i].Y);
            }

            Points = newPoints;
            pointsCount = points.length;
        }
    }

    public void addPoint(Point point) {
        if(Points != null && Points.length != 0)
        {
            Point[] newPoints = new Point[Points.length + 1];

            for(int i = 0; i < Points.length; i++)
            {
                newPoints[i] = new Point(Points[i].X, Points[i].Y);
            }

            newPoints[Points.length] = new Point(point.X, point.Y);
            Points = newPoints;
        }
        else
        {
            Points = new Point[]{point};
        }

        pointsCount++;
    }

    public void addPoint(double x, double y) {
        Point newPoint = new Point(x,y);

        addPoint(newPoint);
    }

    public double getLength() {
        double length = 0;

        for(int i = 1; i < Points.length; i++)
            length+= Points[i-1].getLength(Points[i]);

        return length;
    }

}
