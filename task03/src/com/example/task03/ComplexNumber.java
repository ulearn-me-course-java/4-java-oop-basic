package com.example.task03;

public class ComplexNumber {
    private int realNumber;
    private int imaginaryNumber;

    public int getRealNumber(){
        return realNumber;
    }

    public int getImaginaryNumber(){
        return imaginaryNumber;
    }

    public ComplexNumber(int realNumber, int imaginaryNumber){
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public ComplexNumber add(ComplexNumber cn){
        ComplexNumber newComplexNumber = new ComplexNumber(cn.getRealNumber() + this.realNumber, cn.getImaginaryNumber() + this.imaginaryNumber);
        return (newComplexNumber);
    }

    public ComplexNumber sub(ComplexNumber cn){
        int a = cn.getRealNumber();
        int b = cn.getImaginaryNumber();
        int c = this.realNumber;
        int d = this.imaginaryNumber;
        int newRealNumber = a*c - b*d;
        int newImaginaryNumber = b*c + a*d;
        ComplexNumber newComplexNumber = new ComplexNumber(newRealNumber, newImaginaryNumber);
        return (newComplexNumber);
    }

    public String to_String(){
        return String.format("%d + %di", this.realNumber, this.imaginaryNumber);
    }
}
