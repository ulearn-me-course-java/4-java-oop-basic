package com.example.task03;

public class ComplexNumber {
    private int realUnit;
    private int imaginaryUnit;

    public ComplexNumber(int real, int imgn) {
        this.realUnit = real;
        this.imaginaryUnit = imgn;
    }

    public static ComplexNumber getSum(ComplexNumber first, ComplexNumber second) {
        return new ComplexNumber(first.realUnit + second.realUnit,first.imaginaryUnit + second.imaginaryUnit);
    }
    public static ComplexNumber getMultiply(ComplexNumber first, ComplexNumber second) {
        return new ComplexNumber((first.realUnit * second.realUnit) - (first.imaginaryUnit* second.imaginaryUnit),
                (first.realUnit * second.imaginaryUnit) + (first.imaginaryUnit * second.realUnit));
    }
    public static String toString(ComplexNumber num) {
        if(num.realUnit == 0) {
            return "i" + num.imaginaryUnit;
        }
        if(num.imaginaryUnit == 0) {
            return num.realUnit + "";
        }
        if(num.imaginaryUnit < 0 && Math.abs(num.imaginaryUnit) != 1) {
            return num.realUnit + " - i" + Math.abs(num.imaginaryUnit);
        }
        if(num.imaginaryUnit < 0 && Math.abs(num.imaginaryUnit) == 1) {
            return num.realUnit + " - i";
        }
        if(num.imaginaryUnit == 1) {
            return num.realUnit + " + i";
        }
        return num.realUnit + " + i" + num.imaginaryUnit;
    }
}
