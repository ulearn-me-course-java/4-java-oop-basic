package com.example.task03;

public class ComplexNumber {
    public double RealNum;
    public double ImaginaryNum;

    public ComplexNumber(double realNum, double imaginaryNum) {
        this.RealNum = realNum;
        this.ImaginaryNum = imaginaryNum;
    }

    public ComplexNumber sumNumbers(ComplexNumber comNum) {
        return new ComplexNumber(this.RealNum + comNum.RealNum, this.ImaginaryNum + comNum.ImaginaryNum);
    }

    public ComplexNumber mulNumbers(ComplexNumber comNum) {
        return new ComplexNumber(this.RealNum*comNum.RealNum - this.ImaginaryNum* comNum.ImaginaryNum, this.RealNum*comNum.RealNum + this.ImaginaryNum* comNum.ImaginaryNum);
    }

    public static void printCompNum(ComplexNumber num) {
        System.out.println(String.format("%.3f + %.3fi", num.RealNum, num.ImaginaryNum));
    }


}
