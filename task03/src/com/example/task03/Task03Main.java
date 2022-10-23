package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        complexNumber num1 = new complexNumber(2, 3);
        complexNumber num2 = new complexNumber(4, -2);

        complexNumber result1 = num1.sum(num2);
        result1.printNumber();

        complexNumber result2 = num1.mul(num2);
        result2.printNumber();
    }
}

class complexNumber {
    private double real;
    private  double imaginary;

    public complexNumber(double re, double im) {
        real = re;
        imaginary = im;
    }

    complexNumber sum(complexNumber num) {
        double re = real + num.real;
        double im = imaginary + num.imaginary;
        return new complexNumber(re, im);
    }

    complexNumber mul(complexNumber num) {
        double re = real * num.real + imaginary * num.imaginary * (-1);
        double im = imaginary * num.real + real * num.imaginary;
        return new complexNumber(re, im);
    }

    void printNumber() {
        String output = "";
        if (real != 0) {
            output += real;
        }
        if (imaginary > 0) {
            output += " + " + imaginary + "i";
        }
        else if (imaginary < 0) {
            output += " - " + (-1) * imaginary + "i";
        }
        System.out.println(output);
    }
}