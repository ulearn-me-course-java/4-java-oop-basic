package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1=new ComplexNumber(3,5);
        ComplexNumber num2=new ComplexNumber(4,-2);
        num1.print(num1.sum(num2));
        num2.print(num2.multiply(num1));
    }
}
