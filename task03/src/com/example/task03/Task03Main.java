package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, 15);
        ComplexNumber num2 = new ComplexNumber(2, 3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}
