package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber fNumber = new ComplexNumber(3, 1);
        ComplexNumber sNumber = new ComplexNumber(5, -2);

        // Сложение
        ComplexNumber addition = fNumber.addition(sNumber);
        System.out.println("Сложение: " + addition.toString());

        // Вычитание
        ComplexNumber subtraction = fNumber.subtraction(sNumber);
        System.out.println("Вычитание: " + subtraction.toString());

        // Умножение
        ComplexNumber multiplication = fNumber.multiplication(sNumber);
        System.out.println("Умножение: " + multiplication.toString());

        // Деление
        ComplexNumber division = fNumber.division(sNumber);
        System.out.println("Деление: " + division.toString());
    }
}
