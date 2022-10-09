package com.example.task03;

public class Complex {
    private int material; //вещественная часть
    private int imaginary; //мнимая часть
    public Complex(int material, int imaginary){
        this.material = material;
        this.imaginary = imaginary;
    }
    Complex summ(Complex complex1){
        return new Complex(material+complex1.material,imaginary+complex1.imaginary);
    }
    Complex multy(Complex complex1){
        return new Complex(material*complex1.material - imaginary*complex1.imaginary,material*complex1.imaginary + complex1.material*imaginary);
    }
    public String toString(){
        if (imaginary >= 0) {
            return material+"+"+imaginary+"i";
        }
        else{
            return material+""+imaginary+"i";
        }
    }
}
