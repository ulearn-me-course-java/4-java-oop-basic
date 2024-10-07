package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(3, 4); // 3 + 4i
        ComplexNumber number2 = new ComplexNumber(1, 2); // 1 + 2i

        ComplexNumber sum = number1.sumNumbers(number2);
        ComplexNumber product = number1.multiplyNumbers(number2);

        System.out.println("Первое число: " + number1);
        System.out.println("Второе число: " + number2);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
