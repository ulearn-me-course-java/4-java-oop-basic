package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexFirst = new ComplexNumber(1., 3.);
        ComplexNumber complexSecond = new ComplexNumber(3., 7.);
        System.out.println(String.format("first number: " + complexFirst));
        System.out.println(String.format("second number: " + complexSecond));
        ComplexNumber add = complexFirst.Add(complexSecond);
        ComplexNumber multiply = complexFirst.Multiply(complexSecond);
        System.out.println(String.format("add: ") + add);
        System.out.println(String.format("multiply: ") + multiply);
    }
}
