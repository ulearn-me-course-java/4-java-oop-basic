package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 7);
        ComplexNumber num2 = new ComplexNumber(2, 3);
        System.out.println(num1.sum(num2));
        System.out.println(num1.mult(num2));
    }
}
