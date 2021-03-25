package com.example.task03;

public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString(){
        if (b < 0)
            return a + "" + b + "i";
        else
            return a + "+" + b + "i";
    }

    public ComplexNumber sum(ComplexNumber number){
        return new ComplexNumber(this.a + number.a, this.b + number.b);
    }

    public ComplexNumber subtract(ComplexNumber number){
        return new ComplexNumber(this.a - number.a, this.b - number.b);
    }

    public ComplexNumber multiplication(ComplexNumber number){
        double newA = (this.a * number.a) - (this.b * number.b);
        double newB = (this.b * number.a) + (this.a * number.b);
        return new ComplexNumber(newA, newB);
    }

    public ComplexNumber division(ComplexNumber number){
        double newA = (this.a * number.a + this.b * number.b) / (Math.pow(number.a, 2) + Math.pow(number.b, 2));
        double newB = (this.b * number.a - this.a * number.b) / (Math.pow(number.a, 2) + Math.pow(number.b, 2));
        return new ComplexNumber(newA, newB);
    }
}