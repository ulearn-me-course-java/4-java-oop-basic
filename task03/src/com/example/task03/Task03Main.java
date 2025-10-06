package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(1, 3);
        ComplexNumber number2 = new ComplexNumber(1, -4);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number1.add(number2));
        System.out.println(number1.mult(number2));
    }
}
