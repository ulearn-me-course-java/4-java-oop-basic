package com.example.task03;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сomplex real part number 1: ");
        double number1Real = in.nextDouble();

        System.out.println("Сomplex imaginary part part number 1: ");
        double number1Im = in.nextDouble();

        System.out.println("Сomplex real part number 2: ");
        double number2Real = in.nextDouble();

        System.out.println("Сomplex imaginary part part number 1: ");
        double number2Im = in.nextDouble();

        ComplexN num1 = new ComplexN(number1Real, number1Im);
        ComplexN num2 = new ComplexN(number2Real, number2Im);

        System.out.println(num1.Add(num2).toStringAdd());
        System.out.println(num1.Multi(num2).toStringMulti());


    }
}
