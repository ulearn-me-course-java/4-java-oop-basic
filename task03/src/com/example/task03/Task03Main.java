package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex num1 = new Complex(3, 2);   // 3 + 2i
        Complex num2 = new Complex(1, -4);  // 1 - 4i

        Complex sum = num1.add(num2);
        System.out.println("Сумма: " + num1 + " + " + num2 + " = " + sum);

        Complex product = num1.multiply(num2);
        System.out.println("Произведение: " + num1 + " * " + num2 + " = " + product);
    }
}
