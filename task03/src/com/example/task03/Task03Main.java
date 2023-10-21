package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber("7+3i");
        ComplexNumber num2 = new ComplexNumber(5, -8);
        System.out.println(num1.Multiply(num2).ToString());
        ComplexNumber num3 = new ComplexNumber(" 4 - 5i ");
        ComplexNumber num4 = new ComplexNumber(12, -7);
        System.out.println(num3.Sum(num4).ToString());
        ComplexNumber num5 = new ComplexNumber(" 4 - 5i ");
    }
}