package com.example.task03;

//z=x+iy
public class ComplexNumber {

    private double rez;//Действительная часть
    private double imz;//Мнимая часть без i

    //region Get And Set
    public double getImz() {
        return imz;
    }

    public double getRez() {
        return rez;
    }

    public void setImz(double imz) {
        this.imz = imz;
    }

    public void setRez(double rez) {
        this.rez = rez;
    }
    //endregion

    public ComplexNumber(double rez, double imz) {
        this.imz = imz;
        this.rez = rez;
    }

    public ComplexNumber sum(ComplexNumber complexNumber) {
        return new ComplexNumber(rez + complexNumber.rez, imz + complexNumber.imz);
    }

    public ComplexNumber mul(ComplexNumber complexNumber) {
        return new ComplexNumber(rez * complexNumber.rez - imz * complexNumber.imz, rez * complexNumber.imz + imz * complexNumber.rez);
    }

    @Override
    public String toString() {
        return rez + " " + (imz > 0 ? "+" : "") + imz + 'i';
    }

}
