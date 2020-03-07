package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(2,5);
        ComplexNumber second = new ComplexNumber(4,6);
        ComplexNumber a = first.sum(second);
        ComplexNumber b = first.multiply(second);
        System.out.println(b.toString());
        System.out.println(a.toString());
    }
}

class ComplexNumber{

    private double re, im;

    ComplexNumber () { }

    ComplexNumber (double r)
    {
        re = r;
        im = 0;
    }

    ComplexNumber(double r, double i)
    {
        re = r;
        im = i;
    }

    ComplexNumber sum(ComplexNumber number){
        return new ComplexNumber(this.re +number.re,this.im + number.im);
    }
    ComplexNumber multiply(ComplexNumber number){
        return new ComplexNumber(this.re * number.re - this.im * number.im, this.re * im + this.im * number.re);
    }

    @Override
    public String toString() {
        return (this.re + " + i*"+this.im);
    }
}