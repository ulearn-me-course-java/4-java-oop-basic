package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex number1 = new Complex(3, 2);      // 3 + 2i
        Complex number2 = new Complex(1, -4);     // 1 - 4i

        Complex sum = number1.add(number2);
        System.out.println("Первое число: " + number1);
        System.out.println("Второе число: " + number2);
        System.out.println("Сумма: " + sum);

        Complex product = number1.multiply(number2);
        System.out.println("Произведение: " + product);

        System.out.println(number1);
        System.out.println(number2);
    }
}
