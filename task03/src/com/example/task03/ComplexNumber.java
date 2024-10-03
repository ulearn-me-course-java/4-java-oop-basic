package com.example.task03;

/**
 * Класс комплексного числа z = a + b * i
 */

public class ComplexNumber {
    private double a; //действительная часть
    private double b; //мнимая часть

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static ComplexNumber Sum(ComplexNumber num1, ComplexNumber num2) {
        double resultA = num1.a + num2.a;
        double resultB = num1.b + num2.b;
        return new ComplexNumber(resultA, resultB);
    }

    public static ComplexNumber Multiply(ComplexNumber num1, ComplexNumber num2) {
        double resultA = num1.a * num2.a - num1.b * num2.b;
        double resultB = num1.a * num2.b + num1.b * num2.a;
        return new ComplexNumber(resultA, resultB);
    }

    public String toString() {
        String resultString;
        String a = String.valueOf(this.a);
        String b = String.valueOf(this.b);
        resultString = a + "+" + b + "i";
        return resultString;
    }

}
