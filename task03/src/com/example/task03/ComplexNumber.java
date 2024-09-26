package com.example.task03;

public class ComplexNumber {
    private double realNum;
    private double imaginaryNum;

    public ComplexNumber(double realN, double imgN) {
        this.realNum = realN;
        this.imaginaryNum = imgN;
    }

    public ComplexNumber sumComplexNum(ComplexNumber num) {
        double newRealNum = this.realNum + num.realNum;
        double newImaginaryNum = this.imaginaryNum + num.imaginaryNum;
        return new ComplexNumber(newRealNum, newImaginaryNum );
    }

    public ComplexNumber multComplexNum(ComplexNumber num) {
        double newRealNum = (this.realNum * num.realNum) - (this.imaginaryNum * num.imaginaryNum);
        double newImaginaryNum = (this.imaginaryNum * num.realNum) + (num.imaginaryNum * this.realNum);
        return new ComplexNumber(newRealNum, newImaginaryNum );
    }

    public String toString() {
        return "(" + realNum + " + " + imaginaryNum + "i)";
    }
}
