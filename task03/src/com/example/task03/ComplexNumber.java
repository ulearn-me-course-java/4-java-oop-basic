package com.example.task03;

public class ComplexNumber {
   public final double realPart;
   public final double imaginaryPart;

   public ComplexNumber (double realPart, double imaginaryPart) {
       this.realPart = realPart;
       this.imaginaryPart = imaginaryPart;
   }

   public ComplexNumber add (ComplexNumber complexNumber) {
       return new ComplexNumber(realPart + complexNumber.realPart,
               imaginaryPart + complexNumber.imaginaryPart);
   }

   public ComplexNumber mult (ComplexNumber complexNumber) {
       return new ComplexNumber(realPart*complexNumber.realPart - imaginaryPart*complexNumber.imaginaryPart,
               imaginaryPart*complexNumber.realPart + complexNumber.imaginaryPart*realPart);
   }
}
