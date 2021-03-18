package com.example.task03;

public class ComplexNumber {

    private final double _realPart;
    private final double _imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this._realPart = realPart;
        this._imaginaryPart = imaginaryPart;
    }

    public double getReal() {
        return _realPart;
    }

    public double getImaginary() {
        return _imaginaryPart;
    }

    public double modulus() {
        return Math.sqrt(_realPart * _realPart + _imaginaryPart * _imaginaryPart);
    }

    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(_realPart + z._realPart,
                _imaginaryPart + z._imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber z) {
        return new ComplexNumber(_realPart * z._realPart - _imaginaryPart * z._imaginaryPart,
                _imaginaryPart * z._realPart + _realPart * z._imaginaryPart);
    }

    public String toString() {
        return String.format("%.2f %c %.2fi",
                _realPart,
                getSign(_imaginaryPart),
                Math.abs(_imaginaryPart));
    }

    private char getSign(double number) {
        if ( number < 0)
            return '-';
        return '+';
    }
}