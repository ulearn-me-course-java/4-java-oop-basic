package com.example.task03;

public class ComplexNumber {
    private int valid, imaginary;

    public ComplexNumber(int valid, int imaginary){
        this.valid = valid;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber num){
        return new ComplexNumber(valid + num.valid, imaginary + num.imaginary);
    }

    public ComplexNumber substract(ComplexNumber num){
        return new ComplexNumber(valid - num.valid, imaginary - num.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber num){
        return new ComplexNumber((valid * num.valid - imaginary * num.imaginary),
                (valid * num.imaginary + num.valid * imaginary));
    }

    public String toString(){
        if( imaginary >= 0){
            return valid + "+" + imaginary + "i";
        }
        else{
            return Integer.toString(valid) + imaginary + "i";
        }
    }
}
