package com.example.task03;

public class ComplexNumber {
    private double _realPart;
    private double _imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        _realPart = realPart;
        _imaginaryPart = imaginaryPart;
    }

    public double getRealPart(){
        return _realPart;
    }

    public double getImaginaryPart(){
        return _imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(_realPart + complexNumber._realPart,
                                 _imaginaryPart + complexNumber._imaginaryPart);
    }

    public ComplexNumber mul(ComplexNumber complexNumber) {
        return new ComplexNumber(_realPart * complexNumber._realPart - _imaginaryPart * complexNumber._imaginaryPart,
                                 _realPart * complexNumber._imaginaryPart + _imaginaryPart * complexNumber._realPart);
    }

    public String toString() {
        String pattern = "%s";
        if (_imaginaryPart > 0)
            pattern += "+%si";
        else if (_imaginaryPart < 0)
            pattern += "%si";

        return String.format(pattern, _realPart, _imaginaryPart);
    }
}
