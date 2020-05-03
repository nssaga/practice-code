package nssaga.advance.designPattern.factory;

/**
 * Factory method is a creational design pattern, i.e., related to object
 * creation. In Factory pattern, we create object without exposing the creation
 * logic to client and the client use the same common interface to create new
 * type of object. The idea is to use a static member-function (static factory
 * method) which creates & returns instances, hiding the details of class
 * modules from user.
 * 
 * A factory pattern is one of the core design principles to create an object,
 * allowing clients to create objects of a library(explained below) in a way
 * such that it doesn't have tight coupling with the class hierarchy of the
 * library.
 * 
 * What is meant when we talk about library and clients? A library is something
 * which is provided by some third party which exposes some public APIs and
 * clients make calls to those public APIs to complete its task. A very simple
 * example can be different kinds of Views provided by Android OS.
 * 
 *
 * @author Nawal Sah
 */

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape circle = shapeFactory.getShape("CIRCLE");

		// call draw method of Circle
		circle.draw();

		// get an object of Square and call its draw method.
		Shape square = shapeFactory.getShape("SQUARE");

		// call draw method of circle
		square.draw();
	}
}
