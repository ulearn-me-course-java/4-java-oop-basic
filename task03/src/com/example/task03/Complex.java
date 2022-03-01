package com.example.task03;

public class Complex {
    private double Re = 0;
    private double Im = 0;
    public Complex(double a,double b){
        this.Re = a;
        this.Im = b;
    }
    public Complex(double re){
        this.Re = re;
    }

    public double getIm() {
        return this.Im;
    }

    public double getRe() {
        return this.Re;
    }
    public Complex add(Complex num){
        if(num != null)
            return new Complex(this.Re + num.Re, this.Im + num.Im);
        return this;
    }
    public Complex sub(Complex num){
        if(num != null)
            return new Complex(this.Re - num.Re, this.Im - num.Im);
        return this;
    }
    public Complex mul(Complex num){
        if(num != null){
            double newRe = this.Re * num.Re - this.Im * num.Im;
            double newIm = this.Re * num.Im + num.Re * this.Im;
            return new Complex(newRe,newIm);
        }
        return this;
    }
    @Override
    public String toString () {
        if(this.Re != 0 && this.Im != 0)
            return String.format("(%s + %si)", this.Re,this.Im);
        if(this.Im == 0)
            return String.format("(%s)", this.Re);
        if(this.Re == 0)
            return String.format("(%si)", this.Im);
        return String.format("(%s + %si)", this.Re,this.Im);
    }
}
