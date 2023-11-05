package com.example.task03;


public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber num1 = new ComplexNumber(15,4);

        ComplexNumber num2 = new ComplexNumber(5,1);

        System.out.println(num1.toString());
        System.out.println(num2.toString());

        System.out.println(num1.add(num2).toString());
        System.out.println(num1.multiply(num2).toString());


    }
}
