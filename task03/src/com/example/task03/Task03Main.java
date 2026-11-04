package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(2, 3);
        ComplexNumber secondNumber = new ComplexNumber(4, 5);

        ComplexNumber sum = firstNumber.add(secondNumber);
        ComplexNumber product = firstNumber.multiply(secondNumber);

        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}