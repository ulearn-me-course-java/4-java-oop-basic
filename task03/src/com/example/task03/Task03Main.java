package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        // Вычисляем сумму
        ComplexNumber sum = num1.add(num2);
        System.out.println("Сумма: " + sum);

        // Вычисляем произведение
        ComplexNumber product = num1.multiply(num2);
        System.out.println("Произведение: " + product);
    }
}
