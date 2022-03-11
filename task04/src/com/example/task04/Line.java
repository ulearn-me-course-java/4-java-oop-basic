public class Line {
    private Point P1;
    private Point P2;
    public Line(Point P1, Point P2)
    {
        this.P1 = P1;
        this.P2 = P2;
    }
    public Point getP1()
    {
        return P1;
    }
    public Point getP2()
    {
        return P2;
    }

    public String toString()
    {
        String segment = "Отрезок P1P2 ограничена точками P1" + getP1() + " и P2" + getP2();
        return segment;
    }

    public boolean isCollinearLine(Point p)
    {
        boolean isIt;
        //проверка лежит ли переданная точка на прямой
        //P1(x, y) -начало отрезка и P2(x, y) -конец отрезка
        if((p.x - P1.x)/(P2.x - P1.x) == (p.y - P1.y)/(P2.y - P1.y))
        {
            isIt = true;
        }
        else
        {
            isIt = false;
        }
        return isIt;
    }
}
