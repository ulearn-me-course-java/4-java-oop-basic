package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, 8);
        ComplexNumber num2 = new ComplexNumber(4, 3);

        ComplexNumber.printCompNum(num1.sumNumbers(num2));
        ComplexNumber.printCompNum(num1.mulNumbers(num2));
    }


}
