package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 6);
        ComplexNumber num2 = new ComplexNumber(3, 2);
        ComplexNumber numSum = ComplexNumber.sum(num1, num2);
        ComplexNumber numMulti = ComplexNumber.miltipl(num1, num2);
        System.out.println(num1.num + " + " + num2.num + " = " +  numSum.num);
        System.out.println(num1.num + " * " + num2.num + " = " + numMulti.num);
    }
}
