package com.example.task03;

public class ComplexNum {

    private double x;
    private double iy;

    public double getX() {
        return x;
    }

    public double getIy() {
        return iy;
    }

    /*
        x - действительная часть комплексного числа z = x + iy
        y - мнимая часть комплексного числа z = x + iy
        i - так называемая мнимая единица, символ, квадрат которого равен –1
         */
    ComplexNum(double realPart, double imgPart) {
        this.x = realPart;
        this.iy = imgPart;
    }

    //Сложение и вычитание происходят по правилу (a + bi) + (c + di) = (a + c) + (b + d)i
    public static ComplexNum sum(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.getX() + z2.getX(), z1.getIy() + z2.getIy());
    }

    //умножение — по правилу (a + bi) * (c + di) = (ac – bd) + (ad + bc)i
    public static ComplexNum multiplication(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.getX() * z2.getX() - z1.getIy() * z2.getIy(),
                z1.getX() * z2.getIy() + z1.getIy() * z2.getX());
    }

    public String toString() {
        if (iy != 0) return x + " + " + iy + " * i";
        else return Double.toString(x);
    }
}
