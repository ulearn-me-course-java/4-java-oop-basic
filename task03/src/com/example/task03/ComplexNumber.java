package com.example.task03;

public class ComplexNumber {
    private int realUnit;
    private int imaginaryUnit;

    public ComplexNumber(int realUnit, int imaginaryUnit) {
        setRealUnit(realUnit);
        setImaginaryUnit(imaginaryUnit);
    }

    public void setRealUnit(int realUnit) {
        this.realUnit = realUnit;
    }

    public int getRealUnit() {
        return realUnit;
    }

    public void setImaginaryUnit(int imaginaryUnit) {
        this.imaginaryUnit = imaginaryUnit;
    }

    public int getImaginaryUnit() {
        return imaginaryUnit;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(realUnit + complexNumber.getRealUnit(), imaginaryUnit + complexNumber.getImaginaryUnit());
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(realUnit * complexNumber.getRealUnit() - imaginaryUnit * complexNumber.getImaginaryUnit(),
                realUnit * complexNumber.getImaginaryUnit() + imaginaryUnit * complexNumber.getRealUnit());
    }

    public String toString() {
        return realUnit + (imaginaryUnit > 0 ? "+" : "-") + imaginaryUnit + "i";
    }
}
