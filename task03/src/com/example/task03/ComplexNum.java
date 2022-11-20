package com.example.task03;

public class ComplexNum {
    final double real;
    final double imaginary;
    public ComplexNum (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNum SumNum(ComplexNum number) {
        return new ComplexNum(this.real + number.real, this.imaginary + number.imaginary);
    }
    public ComplexNum MultiNum(ComplexNum number) {
        double real = this.real * number.real - this.imaginary * number.imaginary;
        double imaginary = this.real * number.imaginary + number.real * this.imaginary;
        return new ComplexNum(real, imaginary);
    }
    public void WriteNum() {
        System.out.print(real);
        if (imaginary < 0) {
            System.out.println(imaginary + "i");
        }
        else {
            System.out.println("+" + imaginary + "i");
        }
    }
}
