package FactoryDesignPattern;

public class FactoryPatternDemo {

    public static void tryOutFactoryPattern(){
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle, set radius and calculate area
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        Circle circle = (Circle)circleShape;
        circle.setRadius(10);
        System.out.println("Area of circle : "+circle.calculateArea());

        // get and objeect of Rectangle, set length, width and calculate area
        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        Rectangle rectangle = (Rectangle)rectangleShape;
        rectangle.setLength(10);
        rectangle.setWidth(15);
        System.out.println("Area of rectangle : "+rectangle.calculateArea());
    }
}
