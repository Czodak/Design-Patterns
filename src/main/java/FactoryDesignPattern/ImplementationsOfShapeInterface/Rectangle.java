package FactoryDesignPattern.ImplementationsOfShapeInterface;

import FactoryDesignPattern.Shape;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        try{
            return length*width;
        }catch (ArithmeticException arithmeticException){
            throw new ArithmeticException();
        }
    }
}
