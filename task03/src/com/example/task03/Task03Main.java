package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber num1 = new ComplexNumber(10, 20);
        ComplexNumber num2 = new ComplexNumber(0, -10);

        System.out.println(num1.add(num2).toString());
        System.out.println(num1.substract(num2).toString());
        System.out.println(num1.multiply(num2).toString());
    }
}
