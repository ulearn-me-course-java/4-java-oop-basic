package com.example.task03;

import java.io.Console;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber();
        b.valid = 3;
        b.imaginary = -2;
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.amountOfComplex(b).toString());
        System.out.println(a.productOfComplex(b).toString());
    }
}
