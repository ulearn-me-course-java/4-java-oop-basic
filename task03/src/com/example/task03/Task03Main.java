package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber();
        num1.setRealPart(2.5);
        num1.setImaginaryPart("i");

        ComplexNumber num2 = new ComplexNumber();
        num2.setRealPart(1.5);
        num2.setImaginaryPart("2i");

        ComplexNumber sum = num1.sum(num2);
        ComplexNumber mul = num1.mul(num2);

        System.out.println(sum.print());
        System.out.println(mul.print());
    }
}
