package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(2.8, 4.2),
                      complex2 = new ComplexNumber(3, -5);

        System.out.println(String.format("%s * %s = %s", complex1, complex2, complex1.multiply(complex2)));
    }
}
