package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(12,5);
        ComplexNumber second = new ComplexNumber(90,34);
        ComplexNumber sum= first.add(second);
        ComplexNumber multiply = first.multiply(second);
    }
}
