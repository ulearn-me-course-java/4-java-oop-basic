package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(4, -3);
        ComplexNumber second = new ComplexNumber(1, 7);
        ComplexNumber sum = first.add(second);
        ComplexNumber product = first.mult(second);
        System.out.format("sum: (%s, %s * i), product: (%s, %s * i)",sum.realPart, sum.imaginaryPart, product.realPart, product.imaginaryPart);
    }
}
