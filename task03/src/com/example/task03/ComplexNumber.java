package com.example.task03;

public class ComplexNumber {
    int realUnit;
    int imaginaryUnit;

    public ComplexNumber(int realUnit, int imaginaryUnit){
        this.realUnit = realUnit;
        this.imaginaryUnit = imaginaryUnit;
    }

    ComplexNumber sum(ComplexNumber n) {
        return new ComplexNumber(realUnit + n.realUnit, imaginaryUnit + n.imaginaryUnit);
    }

    ComplexNumber multiply(ComplexNumber n) {
        return new ComplexNumber(realUnit * n.realUnit - imaginaryUnit * n.imaginaryUnit,
                imaginaryUnit * n.realUnit + realUnit * n.imaginaryUnit);
    }

}
