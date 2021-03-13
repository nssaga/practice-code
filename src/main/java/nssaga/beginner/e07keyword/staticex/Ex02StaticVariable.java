package nssaga.beginner.e07keyword.staticex;

/**
 * https://www.javamadesoeasy.com/2015/05/static-keyword-in-java-variable-method.html
 */
public class Ex02StaticVariable {

	public static void main(String[] args) {
		StaticVariable sv = null;
		System.out.println(sv.x);
		// static variable can also be called when object reference of a class is
		// declared and
		// also when object is created but always recommended to use class reference.
		System.out.println(StaticVariable.x);

		m1();
	}

	// Static keyword can be used before or after public but return type can only be
	// used after access modifier
	static public void m1() {
		System.out.println("M1");
	}

}

class StaticVariable {
	static int x;

}