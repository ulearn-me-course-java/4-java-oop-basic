package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        // Создаем два комплексных числа
        ComplexNumber c1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber c2 = new ComplexNumber(1.0, -4.0);

        System.out.println("Первое число: " + c1);
        System.out.println("Второе число: " + c2);

        System.out.println("--- Сложение ---");
        ComplexNumber sum = c1.add(c2);
        System.out.println("Сумма: " + sum);

        // Проверка, что c1 не изменилось (иммутабельность)
        System.out.println("Проверка c1 (должно остаться прежним): " + c1);

        System.out.println("--- Умножение ---");
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Произведение: " + product);
    }
}