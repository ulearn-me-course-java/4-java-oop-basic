package com.example.task03;

public class ComplexNumber {
    private double realNumber;
    private double imaginaryNumber;

    public ComplexNumber(double r, double i) {
        realNumber = r;
        imaginaryNumber = i;
    }
    public ComplexNumber(){
    }

    public double getR() {
        return realNumber;
    }

    public double getI() {
        return imaginaryNumber;
    }

    public ComplexNumber Add(ComplexNumber number){
        return new ComplexNumber(number.realNumber + this.realNumber, number.imaginaryNumber + this.imaginaryNumber);
    }

    public ComplexNumber Multiply(ComplexNumber number){
        return new ComplexNumber(number.realNumber * this.realNumber - number.imaginaryNumber * this.imaginaryNumber,
                number.imaginaryNumber * this.realNumber + this.imaginaryNumber * number.realNumber);
    }

    public String toString(){
        return realNumber + "+" + imaginaryNumber + "i";
    }
}
