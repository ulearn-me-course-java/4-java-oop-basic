/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    void print(Point p) {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    double distance(Point p2)
    {
        double result = (p2.x - this.x) + (p2.y - this.y);
        return result;
    }
    public String toString()
    {
        return "(" + this.x +", " + this.y + ")";
    }
}
