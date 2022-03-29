package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber( 12, 2);
        ComplexNumber num2 = new ComplexNumber( 1, -5);
        ComplexNumber num3 = num1.sum(num2);
        ComplexNumber num4 = num1.mult(num2);
    }
}

