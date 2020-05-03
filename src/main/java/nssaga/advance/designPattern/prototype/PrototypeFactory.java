package nssaga.advance.designPattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype Design Pattern
 * 
 * Prototype Design Pattern,  Prototype Pattern says that cloning
 * of an existing object instead of creating new one and can also be customized
 * as per the requirement.
 * 
 * This pattern should be followed, if the cost of creating a new object is
 * expensive and resource intensive.
 * 
 * Advantage of Prototype Pattern
 * 
 * The main advantages of prototype pattern are as follows:
 * 
 * It reduces the need of sub-classing. It hides complexities of creating
 * objects. The clients can get new objects without knowing which type of object
 * it will be. It lets you add or remove objects at runtime. Usage of Prototype
 * Pattern
 * 
 * When the classes are instantiated at runtime.-  When the cost of creating an
 * object is expensive or complicated. 
 * 
 * When you want to keep the number of classes in an application minimum. When the client application needs to be
 * unaware of object creation and representation.
 * 
 * @author Nawal Sah
 */
public class PrototypeFactory {

	public static void main(String[] args) {
		String ar[] = { "nawal", "sah", "s" };
		for (String type : ar) {
			Person prototype = CustomFactory.getPrototype(type);
			if (prototype != null) {
				System.out.println(prototype);
			} else {
				System.out.println("Run again with string array ");
			}
		}

	}
}

interface Person {
	Person clone();
}

class Nawal implements Person {

	private final String NAME = "Nawal";

	@Override
	public Person clone() {
		return new Nawal();
	}

	public String toString() {
		return NAME;
	}
}

class Kumar implements Person {
	private final String NAME = "Kumar";

	@Override
	public Person clone() {
		return new Kumar();
	}

	public String toString() {
		return NAME;
	}

}

class Sah implements Person {
	private final String NAME = "Sah";

	@Override
	public Person clone() {
		return new Sah();
	}

	public String toString() {
		return NAME;
	}
}

class CustomFactory {
	private static final Map<String, Person> prototypes = new HashMap<>();

	static {
		prototypes.put("nawal", new Nawal());
		prototypes.put("kumar", new Kumar());
		prototypes.put("sah", new Sah());
	}

	public static Person getPrototype(String type) {
		try {
			return prototypes.get(type).clone();
		} catch (NullPointerException e) {
			System.out.println("Prototype with name: " + type + ", doesn't exist");
			return null;
		}
	}
}
