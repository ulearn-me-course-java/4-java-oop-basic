package com.example.task03;

public class  ComplexNumber {

    double a, b;

    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }

    public ComplexNumber(){

        this(0,0);
    }


    public ComplexNumber add(ComplexNumber complex){

        return new ComplexNumber(a+complex.a, b+complex.b);
    }

    public  ComplexNumber sub(ComplexNumber complex){

        return new  ComplexNumber(a-complex.a, b-complex.b);
    }

    public  ComplexNumber mult( ComplexNumber complex){

        return new  ComplexNumber(a*complex.a+complex.b*b*-1, a*complex.b+b*complex.a);
    }

    public String toString() {

        return b<0 ? a+""+b+"i":a+"+"+b+"i";
    }
}