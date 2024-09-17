package com.example.task03;

public class ComplexNumber {
    private int Real;
    private int Im;

    public ComplexNumber(int real, int im) {
        Real = real;
        Im = im;
    }

    //region Getters And Setters
    public int getReal() {
        return Real;
    }

    public void setReal(int real) {
        Real = real;
    }

    public int getIm() {
        return Im;
    }

    public void setIm(int im) {
        Im = im;
    }
    //endregion

    public ComplexNumber add(ComplexNumber c){
        return new ComplexNumber(Real + c.Real, Im + c.Im);
    }

    public ComplexNumber multiply(ComplexNumber c){
        return new ComplexNumber(Real * c.Real - Im * c.Im, Real * c.Im + Im * c.Real);
        //(a+bi) * (c+di) = ac+adi+bci+bdii = a*c-bd+(ad+bc)i
    }

    @Override
    public String toString() {
        return String.format("(%d + %di)",Real,Im);
    }
}