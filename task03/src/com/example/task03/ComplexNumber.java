package com.example.task03;

public class ComplexNumber {

    double r;
    double angle;
    private double realPart;
    private double imanginaryPart;

    public  ComplexNumber(){}
    public ComplexNumber(double real,double imng){
        this.realPart=real;
        this.imanginaryPart=imng;
    }

    public double getRealPart(){
        return  realPart;
    }
    public void setRealPart(double number){
        this.realPart=number;
    }
    public double getImanginaryPart(){
        return imanginaryPart;
    }
    public void setImanginaryPart(double number){
        this.imanginaryPart=number;
    }

    public ComplexNumber add(ComplexNumber cn){
        double a =this.realPart+cn.realPart;
        double b=this.imanginaryPart+cn.imanginaryPart;
        return new ComplexNumber(a,b);
    }

    public void subtract(ComplexNumber cn){
        this.realPart-=cn.realPart;
        this.imanginaryPart-= cn.imanginaryPart;
    }

    public ComplexNumber multiply(ComplexNumber complexNumber){
        double a=this.realPart*complexNumber.getRealPart()-this.imanginaryPart*complexNumber.getImanginaryPart();
        double b=this.realPart*complexNumber.getImanginaryPart()+this.imanginaryPart*complexNumber.getRealPart();
        return new ComplexNumber(a,b);
    }
    private void toTrigonometryForm(){
        this.r=Math.sqrt(Math.pow(this.realPart,2)+Math.pow(this.imanginaryPart,2));
        this.angle=Math.acos((double)this.realPart/this.r);
    }

    private void toNormalForm(){
        this.realPart=r*Math.cos(this.angle);
        this.imanginaryPart=r*Math.sin(this.angle);
    }

    public void pow(int n){
        toTrigonometryForm();
        this.r=Math.pow(r,n);
        this.angle=(angle*n)%(2*Math.PI);
        toNormalForm();
    }



    public String toString(){
        return String.format("%d+%di",this.realPart,this.imanginaryPart);
    }

    public String toStringInTrigonometryForm(){
        toTrigonometryForm();
        return String.format("%.3f*(cos(%.3f)+i*sin(%.3f)",this.r,this.angle,this.angle);
    }
}
