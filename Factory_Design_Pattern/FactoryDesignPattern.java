public class FactoryDesignPattern{
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape s1 =  shapeFactory.getShape("Circle");
        Shape s2 = shapeFactory.getShape("Square");

		 s1.draw();
		 s2.draw();
	}
}