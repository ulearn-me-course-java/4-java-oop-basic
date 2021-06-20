package com.example.task03;

public class ComplexNumber {
    double valid;
    double imaginary;

    public ComplexNumber(double valid, double imaginary) {
        this.valid = valid;
        this.imaginary = imaginary;
    }
    public ComplexNumber() {
        this.valid = 0;
        this.imaginary = 0;
    }
    ComplexNumber amountOfComplex(ComplexNumber complexNumber) {
        return new ComplexNumber(this.valid + complexNumber.valid, this.imaginary + complexNumber.imaginary);
    }
    ComplexNumber productOfComplex(ComplexNumber complexNumber) {
        return new ComplexNumber(this.valid * complexNumber.valid - this.imaginary * complexNumber.imaginary, this.valid * complexNumber.imaginary + this.imaginary * complexNumber.valid);
    }
    public String toString() {
        if (this.imaginary == 0) return (String.format("%.2f", valid));
        else if (this.imaginary == 1) return (String.format("%.2f+i", valid));
        else if (this.imaginary == -1) return (String.format("%.2f-i", valid));
        else if (this.imaginary < 0) return (String.format("%.2f%.2fi", valid, imaginary));
        else return (String.format("%.2f+%.2fi", valid, imaginary));
    }
}
