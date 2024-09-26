package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        ComplexNumber c3 = c1.add(c2);
        System.out.println(c3);

        ComplexNumber c4 = new ComplexNumber(5, 6);
        ComplexNumber c5 = new ComplexNumber(7, 8);
        ComplexNumber c6 = c4.mul(c5);
        System.out.println(c6);
    }
}
