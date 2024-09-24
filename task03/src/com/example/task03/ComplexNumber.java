package com.example.task03;

public class ComplexNumber {
    private final double RealPart;
    private final double ImaginePart;

    public ComplexNumber(double realPart, double imaginePart){
        RealPart = realPart;
        ImaginePart = imaginePart;
    }

    public ComplexNumber sumOfComplexNumber(ComplexNumber number){
        double realParts = number.RealPart + RealPart;
        double imagineParts = number.ImaginePart + ImaginePart;
        return new ComplexNumber(realParts, imagineParts);
    }

    public ComplexNumber diffOfComplexNumber(ComplexNumber number){
        double realParts = number.RealPart - RealPart;
        double imagineParts = number.ImaginePart - ImaginePart;
        return new ComplexNumber(realParts, imagineParts);
    }

    public ComplexNumber multiplyOfComplexNumber(ComplexNumber number){
        double firstNumber = number.RealPart * RealPart - number.ImaginePart * ImaginePart;
        double secondNumber = RealPart * number.ImaginePart + ImaginePart * number.RealPart;
        return new ComplexNumber(firstNumber, secondNumber);
    }

    public String toString() {
        String complexOneUnit = "i";
        return (ImaginePart > 0) ? RealPart + "+" + ImaginePart + complexOneUnit : RealPart + "" + ImaginePart + complexOneUnit;
    }

}
