package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumbers complexFirst = new ComplexNumbers(1.0, 2);
        ComplexNumbers complexSecond = new ComplexNumbers(3, 4);
        ComplexNumbers add = complexFirst.Add(complexSecond);
        ComplexNumbers multiply = complexFirst.Multiply(complexSecond);
        System.out.println(add);
        System.out.println(multiply);

    }
}
