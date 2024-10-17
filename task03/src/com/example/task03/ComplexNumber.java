package com.example.task03;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public int getRealPart() {
        return realPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public ComplexNumber(int realPart, int imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        int newRealPart = this.getRealPart() + complexNumber.getRealPart();
        int newImaginaryPart = this.getImaginaryPart() + complexNumber.getImaginaryPart();
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }


    public ComplexNumber multiply(ComplexNumber complexNumber) {
        int newRealPart = (this.getRealPart() * complexNumber.getRealPart()) -
                (this.getImaginaryPart() * complexNumber.getImaginaryPart());

        int newImaginaryPart = (this.getRealPart() * complexNumber.getImaginaryPart()) +
                (this.getImaginaryPart() * complexNumber.getRealPart());

        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public String toString() {
        if (this.getImaginaryPart() >= 0) {
            return String.format("%d+%di", this.getRealPart(), this.getImaginaryPart());
        } else return String.format("%d%di", this.getRealPart(), this.getImaginaryPart());
    }
}
