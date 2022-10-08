package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNum n1 = new ComplexNum(2, 3);
        ComplexNum n2 = new ComplexNum(5, 6);
        ComplexNum sum = n1.sum(n2);
        ComplexNum mult = n1.mult(n2);
        System.out.printf("%.2f + %.2f * i\n", sum.a, sum.b);
        System.out.printf("%.2f + %.2f * i", mult.a, mult.b);

    }
}
