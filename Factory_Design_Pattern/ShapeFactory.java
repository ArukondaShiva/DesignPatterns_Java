public class ShapeFactory{
    public Shape getShape(String shapeType){
       if(shapeType.equalsIgnoreCase("Circle")){
          return new Circle();
       }
       else if(shapeType.equalsIgnoreCase("Square")){
          return new Square();
       }
       else{
          return null;
       }
    }
}