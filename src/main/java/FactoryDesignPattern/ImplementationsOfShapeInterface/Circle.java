package FactoryDesignPattern.ImplementationsOfShapeInterface;

import FactoryDesignPattern.Shape;

public class Circle implements Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        try{
            return radius*radius*Math.PI;
        }catch (ArithmeticException arithmeticException){
            throw new ArithmeticException();
        }
    }
}
