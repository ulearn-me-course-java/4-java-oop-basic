package com.example.task03;

public class ComplexNumber {

    private int mainPart;
    private int complexPart;

    public ComplexNumber(int mainPart, int complexPart) {
        setMainPart(mainPart);
        setComplexPart(complexPart);
    }

    public int getMainPart() {
        return mainPart;
    }

    public int getComplexPart() {
        return complexPart;
    }

    public void setMainPart(int mainPart) {
        this.mainPart = mainPart;
    }

    public void setComplexPart(int complexPart) {
        this.complexPart = complexPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(this.mainPart + complexNumber.mainPart,
                this.complexPart + complexNumber.complexPart);
    }

    public ComplexNumber mul(ComplexNumber complexNumber) {
        int mainPartThis = getMainPart();
        int complexPartThis = getComplexPart();
        int mainPartNumber = complexNumber.getMainPart();
        int complexPartNumber = complexNumber.getComplexPart();
        return new ComplexNumber(mainPartThis * mainPartNumber - complexPartThis * complexPartNumber,
                complexPartThis * mainPartNumber + mainPartThis * complexPartNumber);
    }

    public String toString() {
        return "Answer : " + getMainPart() + "+" + getComplexPart() + "i";
    }
}
