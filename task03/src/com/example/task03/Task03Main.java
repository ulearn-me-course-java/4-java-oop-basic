package com.example.task03;

public class Task03Main
{
    public static void main(String[] args)
    {
        ComplexNumber num1 = new ComplexNumber(6,3);
        ComplexNumber num2 = new ComplexNumber(4,7);
        ComplexNumber addition = num1.add(num2);
        ComplexNumber multiplication = num1.multiply(num2);
        System.out.println(addition.toString());
        System.out.println(multiplication.toString());
    }
}
