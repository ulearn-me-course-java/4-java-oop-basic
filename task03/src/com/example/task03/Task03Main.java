package com.example.task03;

public class Task03Main {

    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(2,3);
        ComplexNumber secondNumber = new ComplexNumber(-1,1);
        ComplexNumber sumResult = firstNumber.sum(secondNumber);
        ComplexNumber mulResult = firstNumber.mul(secondNumber);
        System.out.println(sumResult.toString());
        System.out.println(mulResult.toString());
    }

}
