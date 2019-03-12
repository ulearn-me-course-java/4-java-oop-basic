package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(-1, 1);

        System.out.println("First num =" + a);
        System.out.println("Second num =" + b);
        System.out.println("a * b = " + ComplexNumber.Multyply(a, b));
        System.out.println("a + b = " + ComplexNumber.Add(a, b));
    }
}
