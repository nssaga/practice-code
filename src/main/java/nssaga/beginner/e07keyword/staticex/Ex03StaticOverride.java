package nssaga.beginner.e07keyword.staticex;

/**
 * Static method cannot be overridden in java, any attempt to do this will not
 * cause compilation error, but the results won’t be same when we would have
 * overridden non-static methods.
 * 
 * But why? Overriding in Java means that the method would be called on the run
 * time based on type of the object and not on the compile time type of it .
 * 
 * But static methods are class methods access to them is always resolved during
 * compile time only using the compile time type information.
 * 
 * Static method cannot be overridden, any attempt to do this will not cause
 * compilation error.
 * 
 * Static method cannot be overridden with non-static method, any attempt to do
 * this will cause compilation error.
 * 
 * Non-static method cannot be overridden with static method, any attempt to do
 * this will cause compilation error.
 * 
 * Static should not called by object reference, it is bad practice.
 */
public class Ex03StaticOverride {

	public static void main(String[] args) {
		SuperClass s1 = new SubClass();
		s1.method1(); // it will call super class

	}
}

class SuperClass {
	static void method1() {
		System.out.println("Super class method");
	}
}

class SubClass extends SuperClass {
	static void method1() {
		System.out.println("Sub class method");
	}
}