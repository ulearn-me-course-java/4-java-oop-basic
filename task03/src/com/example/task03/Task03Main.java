package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum z1 = new ComplexNum(5, -6);
        ComplexNum z2 = new ComplexNum(-3, 2);
        ComplexNum result = ComplexNum.sum(z1, z2);
        System.out.println(result);
    }
}
