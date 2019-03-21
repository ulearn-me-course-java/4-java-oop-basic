package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, -4);
        ComplexNumber c2 = new ComplexNumber(5, 3);
        System.out.println(c1.sum(c2));
        System.out.println(c1.mult(c2));
    }
}
