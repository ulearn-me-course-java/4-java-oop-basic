package com.example.task03;

public class Task03Main {
    public static void main(String[] args)
    {
        Complex number1 = new Complex(3, 4);
        Complex number2 = new Complex(1, 2);

        Complex sum = number1.add(number2);
        System.out.println("Sum: " + sum);

        Complex product = number1.multiply(number2);
        System.out.println("Product: " + product);
    }
}
