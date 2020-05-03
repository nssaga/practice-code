package nssaga.advance.designPattern.factory;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase(ShapeType.CIRCLE.name())) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase(ShapeType.SQUARE.name())) {
			return new Square();
		} else {
			return null;
		}
	}
}

enum ShapeType {
	CIRCLE,
	SQUARE
}