package com.example.task03;

public class Task03Main {

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2,3);
        ComplexNumber num2 = new ComplexNumber(5,-7);
        System.out.println((num1.add(num2)).tostring());
        System.out.println((num1.mult(num2)).tostring());
    }

}
