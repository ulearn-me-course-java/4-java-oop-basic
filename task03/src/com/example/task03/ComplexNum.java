package com.example.task03;

public class ComplexNum {

    //a + bi
    double a;
    double b;

    public ComplexNum(double a, double b){
        this.a = a;
        this.b = b;
    }

    public ComplexNum sum(ComplexNum c){
        return new ComplexNum(a + c.a, b + c.b);
    }

    public ComplexNum mult(ComplexNum c){
        return new ComplexNum(a * c.a - b*c.b, a * c.b + b *c.a);
    }

}
