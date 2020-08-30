package FactoryDesignPattern;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType.equals("CIRCLE")){
            return new Circle();
        }else if(shapeType.equals("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
