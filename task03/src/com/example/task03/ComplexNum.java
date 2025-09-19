package com.example.task03;

public class ComplexNum {
    private final double rePart;
    private final double imPart;

    public double getImPart() {
        return imPart;
    }

    public double getRePart() {
        return rePart;
    }

    public ComplexNum(double dPart, double mPart){
        this.rePart = dPart;
        this.imPart = mPart;
    }

    public ComplexNum Reverse(ComplexNum num){
        return new ComplexNum(num.rePart,-num.imPart);
    }

    public ComplexNum Add(ComplexNum num){
        return new ComplexNum(rePart + num.imPart, imPart + num.imPart);
    }

    public ComplexNum Multiply(ComplexNum num){
        return new ComplexNum((rePart*num.rePart - imPart*num.imPart),(rePart*num.imPart + imPart*num.rePart));
    }

    @Override
    public String toString(){
        if(imPart>=0){
            return rePart + "+" + imPart + "i";
        }
        return rePart + "-" + imPart + "i";
    }

}
