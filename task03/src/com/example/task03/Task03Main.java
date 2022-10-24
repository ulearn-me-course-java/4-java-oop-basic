package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(0.34,8);
        System.out.println(z1);
        ComplexNumber z2 = new ComplexNumber(13,-2);
        System.out.println(z2);
        System.out.println();
        ComplexNumber mul = z1.multiply(z2);
        System.out.println(mul);

        ComplexNumber sum = z1.add(z2);
        System.out.println(sum);

    }
}
