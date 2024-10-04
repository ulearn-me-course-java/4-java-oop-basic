package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        // Создаем два комплексных числа
        ComplexNumber c1 = new ComplexNumber(-2.0, -3.0);
        ComplexNumber c2 = new ComplexNumber(4.0, 1.0);

        // Вычисляем их сумму
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum);

        // Вычисляем их произведение
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Multiply: " + product);
    }
}
