package com.example.task03;

import java.util.Scanner;

public class Task03Main {
    private static Scanner scan = new Scanner(System.in);
    private static int _command;

    public static void main(String[] args) {
        try {
            while (chooseCommand() != 0) {

                if (_command < 0 || _command > 2) {
                    System.out.println("!!! Unknown _command !!!");
                } else {
                    result(firstInput(), secondInput());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static int chooseCommand() {
        System.out.println("Choose command(1 - sum; 2 - multiplication; 0 - exit)");
        _command = scan.nextInt();
        return _command;
    }

    private static ComplexNum firstInput() {
        System.out.println("Enter the first complex number");

        System.out.println("Real part:");
        Double num1 = scan.nextDouble();

        System.out.println("Imaginary part:");
        Double num2 = scan.nextDouble();

        System.out.println();

        ComplexNum number1 = new ComplexNum(num1, num2);
        return number1;
    }

    private static ComplexNum secondInput() {
        System.out.println("Enter the second complex number");

        System.out.println("Real part:");
        Double num3 = scan.nextDouble();

        System.out.println("Imaginary part:");
        Double num4 = scan.nextDouble();

        System.out.println();

        ComplexNum number2 = new ComplexNum(num3, num4);
        return number2;
    }

    private static void result(ComplexNum n1, ComplexNum n2) {
        if (_command == 1) {
            System.out.println("Sum ==> " + ComplexNum.sum(n1, n2));
            System.out.println();
        }

        if (_command == 2) {
            System.out.println("Multiplication ==> " + ComplexNum.multiplication(n1, n2));
            System.out.println();
        }
    }
}
