package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexNumber sum = num1.Add(num2);
        ComplexNumber product = num1.Multiply(num2);

        System.out.println("Number 1: "+num1+" Number 2: "+num2);
        System.out.println("Sum: " + sum);
        System.out.println("Multiply: " + product);
    }
}
