package com.example.task03;

import org.junit.Assert;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum complexOne = new ComplexNum(1,2);
        ComplexNum complexTwo = new ComplexNum(3,4);

        ComplexNum add = complexOne.Add(complexTwo);
        ComplexNum multiply = complexOne.Multiplication(complexTwo);
        System.out.println(add);
        System.out.println(multiply);
    }
}
