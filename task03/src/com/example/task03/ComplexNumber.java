package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private String imaginaryPart;

    public ComplexNumber() {
    }

    public ComplexNumber(double realPart, String ImaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = ImaginaryPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public String getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(String imaginaryPart) {
        if (imaginaryPart == "i"){
            this.imaginaryPart = "1i";
        }
        else {
            this.imaginaryPart = imaginaryPart;
        }
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public ComplexNumber sum(ComplexNumber num) {
        double real = this.realPart + num.realPart;
        double coef = Double.parseDouble(this.imaginaryPart.substring(0, this.imaginaryPart.length() - 1)) +
                Double.parseDouble(num.imaginaryPart.substring(0, num.imaginaryPart.length() - 1));
        String imaginary = Double.toString(coef) + "i";

        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber mul(ComplexNumber num) {
        double real = this.realPart * num.realPart +
                (Double.parseDouble(this.imaginaryPart.substring(0, this.imaginaryPart.length() - 1)) *
                Double.parseDouble(num.imaginaryPart.substring(0, num.imaginaryPart.length() - 1))) * (-1);
        double coef = this.realPart * Double.parseDouble(num.imaginaryPart.substring(0, num.imaginaryPart.length() - 1)) +
                Double.parseDouble(this.imaginaryPart.substring(0, this.imaginaryPart.length() - 1)) * num.realPart;
        String imaginary = Double.toString(coef) + "i";

        return new ComplexNumber(real, imaginary);
    }

    public String print() {
        return Double.toString(realPart) + " + " + imaginaryPart;
    }
}
