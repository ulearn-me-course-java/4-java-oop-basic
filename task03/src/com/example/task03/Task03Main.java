package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(1,2);
        ComplexNumber second = new ComplexNumber(3,4);
        ComplexNumber sum = first.sum(second);
        ComplexNumber mult = second.mult(first);
    }
}
