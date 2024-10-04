package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.5, 1);
        ComplexNumber num2 = new ComplexNumber(1.5, 2.0);

        System.out.println("Первое комплексное число: " + num1);
        System.out.println("Второе комплексное число: " + num2);

        ComplexNumber sum = num1.add(num2);
        System.out.println("Сумма комплексных чисел: " + sum);

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Произведение комплексных чисел: " + product);

    }
}
