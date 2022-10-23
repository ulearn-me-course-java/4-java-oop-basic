package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexFirst = new ComplexNumber(1., 2.);
        ComplexNumber complexSecond = new ComplexNumber(3., 4.);
        ComplexNumber add = complexFirst.Add(complexSecond);
        ComplexNumber multiply = complexFirst.Multiply(complexSecond);
        System.out.println(add);
        System.out.println(multiply);
    }
}
