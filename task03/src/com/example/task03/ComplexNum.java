package com.example.task03;

public class ComplexNum {
    private double real;
    private double imagineUnit;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagineUnit() {
        return imagineUnit;
    }

    public void setImagineUnit(double imagineUnit) {
        this.imagineUnit = imagineUnit;
    }

    public ComplexNum(double real, double imagineUnit) {
        this.real = real;
        this.imagineUnit = imagineUnit;
    }

    public ComplexNum Add(ComplexNum complexNum) {
        return new ComplexNum(this.real + complexNum.real,this.imagineUnit + complexNum.imagineUnit);
    }

    public ComplexNum Multiplication(ComplexNum complexNum) {
        return new ComplexNum(
                this.real * complexNum.real - this.imagineUnit * complexNum.imagineUnit,
                this.real * complexNum.imagineUnit + this.imagineUnit * complexNum.real);
    }

    public String toString() {
        return String.format("%s real, %s imagineUnit",this.real,this.imagineUnit);
    }
}
