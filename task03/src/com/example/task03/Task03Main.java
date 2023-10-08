package com.example.task03;

public class
Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 7);
        ComplexNumber b = new ComplexNumber(5, 4);

        System.out.println(a.Add(b).toString());
    }
}
