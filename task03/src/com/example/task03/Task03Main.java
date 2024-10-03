package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber numA = new ComplexNumber(4.5,0.0);
        ComplexNumber numB = new ComplexNumber(1.0,4.123);
        ComplexNumber numS = ComplexNumber.Sum(numA, numB);
        ComplexNumber numM = ComplexNumber.Multiply(numA, numB);
        System.out.println(numS.toString());
        System.out.println(numM.toString());
    }
}
