package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(5, -6);
        ComplexNumber complexNumber1 = new ComplexNumber(5, 10);
        System.out.println(ComplexNumber.add(complexNumber, complexNumber1));
        System.out.println(ComplexNumber.multiply(complexNumber, complexNumber1));
    }
}
