package com.example.task05;
import java.math.BigDecimal;
/**
 * Ломаная линия
 */
public class PolygonalLine {
    PolygonalLinePart firstLinePart;
    PolygonalLinePart lastLinePart;
    private Point tempPoint;

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (int i = 0; i < points.length; i++){
            if (i == points.length - 1)
                continue;
            // чтобы модиаифкация точки не приводила к модофикации ломаной линии
            Point firstPoint = new Point(points[i].getX(), points[i].getY());
            Point secondPoint = new Point(points[i+1].getX(), points[i+1].getY());

            PolygonalLinePart iterationLinePart = new PolygonalLinePart(firstPoint, secondPoint);
            if (firstLinePart == null){
                firstLinePart = iterationLinePart;
                lastLinePart = iterationLinePart;
                continue;
            }
            lastLinePart.linkToNextLine(iterationLinePart);
            lastLinePart = iterationLinePart;
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // чтобы модиаифкация точки не приводила к модофикации ломаной линии
        point = new Point(point.getX(), point.getY());

        Point firstPoint;
        if (lastLinePart != null)
            firstPoint = lastLinePart.getP2();
        else if (tempPoint == null) {
            tempPoint = point;
            return;
        } else  {
            firstPoint = tempPoint;
        }

        PolygonalLinePart newLinePart = new PolygonalLinePart(firstPoint, point);
        if (firstLinePart == null) {
            firstLinePart = newLinePart;
            lastLinePart = newLinePart;
        }
        else {
            lastLinePart.linkToNextLine(newLinePart);
            lastLinePart = newLinePart;
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        addPoint(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double result = 0;
        PolygonalLinePart tempLine = firstLinePart;
        while (tempLine != null) {
            result += tempLine.getP1().getLength(tempLine.getP2());
            tempLine = tempLine.nextLinePart;
        }
        return result;
    }
}
