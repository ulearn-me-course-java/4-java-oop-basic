package com.example.task03;

public class ComplexNumb {
    private double i = Math.sqrt(-1);//never used, but very important
    private double real;
    private double img;

    public ComplexNumb(double realPart, double imgPart) {
        real = realPart;
        img = imgPart;
    }

    public ComplexNumb add(ComplexNumb numb){
        return new ComplexNumb((this.real + numb.real), (this.img + numb.img));
    }

    public ComplexNumb mlt(ComplexNumb numb){
        double ac = this.real * numb.real;
        double bd = this.img * numb.img;
        double ad = this.real * numb.img;
        double bc = this.img * numb.real;

        return new ComplexNumb((ac - bd), (bc+ad));
    }

    public String toString(){
        if(img != 0) return real + " + " + img + "i";
        else return Double.toString(real);
    }
}
