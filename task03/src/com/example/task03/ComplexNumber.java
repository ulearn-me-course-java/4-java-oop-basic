package com.example.task03;

public class ComplexNumber {
     private final double real;
     private final double imaginary;

     public double getReal(){
         return real;
     }
     public double getImaginary(){
         return imaginary;
     }

     public ComplexNumber(double real, double imaginary){
         this.real = real;
         this.imaginary = imaginary;
     }

     public ComplexNumber add(ComplexNumber complexNumber){
         double realPart = real + complexNumber.real;
         double imaginaryPart = imaginary + complexNumber.imaginary;
         return new ComplexNumber(realPart, imaginaryPart);
     }

     public ComplexNumber mult(ComplexNumber complexNumber){
         double realPart = real * complexNumber.real - imaginary * complexNumber.imaginary;
         double imaginaryPart = real * complexNumber.imaginary + imaginary * complexNumber.real;
         return  new ComplexNumber(realPart, imaginaryPart);
     }

     public String toString(){
         if(imaginary >= 0){
             return real + "+" + imaginary + "i";
         }
         return real + "-" + (-imaginary) + "i";
     }
}
