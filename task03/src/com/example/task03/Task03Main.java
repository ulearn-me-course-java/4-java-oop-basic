package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(4.3, 9.7);
        ComplexNumber complexNumber2 = new ComplexNumber(5, 3.9);
        ComplexNumber sum = complexNumber1.add(complexNumber2);
        ComplexNumber prod = complexNumber1.multiply(complexNumber2);

        System.out.format("First complex number: real part is %s and imaginary part is %s\n", complexNumber1.realPart, complexNumber1.imaginaryPart);
        System.out.format("Second complex number: real part is %s and imaginary part is %s\n", complexNumber2.realPart, complexNumber2.imaginaryPart);
        System.out.format("Its sum: real part is %s and imaginary part is %s\n", sum.realPart, sum.imaginaryPart);
        System.out.format("Its product: real part is %s and imaginary part is %s", prod.realPart, prod.imaginaryPart);
    }
}
