package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(2, 3);
        ComplexNumber second = new ComplexNumber(-1, -5);
        ComplexNumber addResult = first.add(second);
        System.out.println(addResult);
        ComplexNumber mulResult = first.multiply(second);
        System.out.println(mulResult);
    }
}
