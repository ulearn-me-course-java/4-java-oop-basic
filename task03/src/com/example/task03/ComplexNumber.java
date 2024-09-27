package com.example.task03;

public class ComplexNumber {
    private int realNumber;
    private int imaginaryUnit;

    public ComplexNumber(int r, int i){
        realNumber = r;
        imaginaryUnit = i;
    }

    public int getRealNumber(){
        return realNumber;
    }
    public int getImaginaryUnit(){
        return imaginaryUnit;
    }

    public void setRealNumber(int rN){
        realNumber = rN;
    }

    public void setImaginaryUnit(int iN){
        imaginaryUnit = iN;
    }

    public String toString(){
        return realNumber+"+"+imaginaryUnit+"i";
    }

    public ComplexNumber  ComplexNumberSum (ComplexNumber number){
        return new ComplexNumber(realNumber+number.getRealNumber(), imaginaryUnit + number.getImaginaryUnit());
    }

    public ComplexNumber  ComplexNumberMulti (ComplexNumber number){
        return new ComplexNumber(realNumber*number.getRealNumber() + (imaginaryUnit * number.getImaginaryUnit() * -1),
                imaginaryUnit*number.getRealNumber()  + number.getImaginaryUnit()*realNumber);

    }
}
