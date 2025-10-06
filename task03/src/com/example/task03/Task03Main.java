package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, 6);
        ComplexNumber num2 = new ComplexNumber(-3, 2);

        System.out.println("Сложение: " + num1.add(num2));
        System.out.println("Умножение: " + num1.multiply(num2));
    }
}
