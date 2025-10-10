package com.example.task03;

import java.io.PrintStream;

public class Task03Main {
    public static void main(String[] args) {
        complexNumber c1 = new complexNumber(3, 2);
        complexNumber c2 = new complexNumber(1, 4);

        complexNumber resultOfSum = c1.sumOfComplex(c2);
        complexNumber resultOfComposition = c1.compositionOfComplex(c2);

        System.out.println(resultOfSum.toString());
        System.out.println(resultOfComposition.toString());
    }
}

class complexNumber{
    public double real;
    public double imaginary;


    public complexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public complexNumber sumOfComplex(complexNumber c){
        complexNumber result = new complexNumber((real + c.real), (imaginary + c.imaginary));
        return result;
    }
    // Суть в том, что при умножении мнимая единица i^2
    public complexNumber compositionOfComplex(complexNumber c){
        double realPart = real * c.real - imaginary * c.imaginary;
        double imaginaryPart = real * c.imaginary + imaginary * c.real;

        complexNumber result = new complexNumber(realPart, imaginaryPart);
        return result;
    }

    public String toString(){
        return String.format("%f + %f i", real, imaginary);
    }

}
