package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(4, 5);
        System.out.println("Number 1: " + number1 + "\nNumber 2: " + number2);
        System.out.println("\nSum: " + number1.sum(number2));
        System.out.println("Product: " + number1.product(number2));
    }
}
