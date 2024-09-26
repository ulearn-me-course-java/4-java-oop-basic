package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(4, 10);
        ComplexNumber num2 = new ComplexNumber(2, 5);
        ComplexNumber num3 = num1.sumComplexNum(num2);
        ComplexNumber num4 = num1.multComplexNum(num2);

        System.out.println("\nСумма: " + num3 + "\nУмножение: " + num4);
    }
}
