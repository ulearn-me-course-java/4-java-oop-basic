package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(6, 2);
        ComplexNumber second = new ComplexNumber(-5, -1);
        ComplexNumber addResult = first.add(second);
        System.out.println(addResult);
        ComplexNumber mulResult = first.multiply(second);
        System.out.println(mulResult);
    }
}
