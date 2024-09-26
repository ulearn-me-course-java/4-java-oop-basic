package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(0, 9);
        ComplexNumber n2 = new ComplexNumber(0, -10);
        ComplexNumber n3 = n1.mult(n2);
        System.out.println(n3.realPart);
        System.out.println(n3.imaginaryPart);
    }
}
