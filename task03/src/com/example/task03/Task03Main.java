package com.example.task03;

import static com.example.task03.ComplexNumber.*;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(-1, 1);
        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());
        ComplexNumber c = ComplexNumber.addition(a, b);
        System.out.println("a + b = " + c.toString());
        ComplexNumber d = ComplexNumber.multiplication(a, b);
        System.out.println("a * b = " + d.toString());
    }
}
