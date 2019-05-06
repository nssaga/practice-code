/**
  InnerClass.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 04-May-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.inner;


/**
 * An inner class without a name and for which only a single object is created.
 * An anonymous inner class can be useful when making an instance of an object
 * with certain “extras” such as overloading methods of a class or interface,
 * without having to actually subclass a class.
 * 
 * Anonymous inner classes are useful in writing implementation classes for
 * listener interfaces in graphics programming.
 * 
 * Anonymous inner class are mainly created in two ways:
 * 
 * 1. Class (may be abstract or concrete) 2. Interface
 * 
 * 
 * Types of anonymous inner class : Based on declaration and behavior, there are
 * 3 types of anonymous Inner classes:
 * 
 * Anonymous Inner class that extends a class : We can have an anonymous inner
 * class that extends a class.For example,we know that we can create a thread by
 * extending a Thread class. Suppose we need an immediate thread but we don’t
 * want to create a class that extend Thread class all the time. By the help of
 * this type of Anonymous Inner class we can define a ready thread as follows:
 * 
 * Anonymous Inner class that implements a interface : For example, we also know
 * that by implementing Runnable interface we can create a Thread. Here we use
 * anonymous Inner class that implements an interface.
 * 
 * Anonymous Inner class that defines inside method/constructor argument :
 * Arguments are often used in graphical user interface (GUI) applications. To
 * get you familiar with syntax lets have a look on the following program that
 * creates a thread using this type of Anonymous Inner class :
 * 
 * Difference between Normal/Regular class and Anonymous Inner class:
 * 
 * A normal class can implement any number of interfaces but anonymous inner
 * class can implement only one interface at a time. A regular class can extend
 * a class and implement any number of interface simultaneously. But anonymous
 * Inner class can extend a class or can implement an interface but not both at
 * a time. For regular/normal class, we can write any number of constructors but
 * we can't write any constructor for anonymous Inner class because anonymous
 * class does not have any name and while defining constructor class name and
 * constructor name must be same. Accessing Local Variables of the Enclosing
 * Scope, and Declaring and Accessing Members of the Anonymous Class Like local
 * classes, anonymous classes can capture variables; they have the same access
 * to local variables of the enclosing scope:
 * 
 * An anonymous class has access to the members of its enclosing class. An
 * anonymous class cannot access local variables in its enclosing scope that are
 * not declared as final or effectively final. Like a nested class, a
 * declaration of a type (such as a variable) in an anonymous class shadows any
 * other declarations in the enclosing scope that have the same name. Anonymous
 * classes also have the same restrictions as local classes with respect to
 * their members:
 * 
 * We cannot declare static initializers or member interfaces in an anonymous
 * class. An anonymous class can have static members provided that they are
 * constant variables. Note that you can declare the following in anonymous
 * classes:
 * 
 * Fields Extra methods (even if they do not implement any methods of the
 * super type) Instance initializers Local classes
 * 
 * 
 * https://www.geeksforgeeks.org/anonymous-inner-class-java/
 * 
 */
public class EX01AnonymousInnerClass {
	public static void main(String[] args) {

		// Here we are creating an object for interface by direct implementation using
		// anonymous class.
		Test t = new Test() {
			@Override
			public void print() {
				System.out.println("Anonymous class implementation");
			}
		};

		t.print();

		/**
		 * Not inner class example
		 */
		WithoutInner wi = new WithoutInner();
		wi.getAge();

		/*
		 * 2. Inner class example of Age interface whose name is not written but an
		 * object to it is created.
		 * 
		 */
		Age age = new Age() {
			@Override
			public void getAge() {
				System.out.println("From Inner class Age : " + age);

			}
		};
		age.getAge();
	}

}

// Ex 1
interface Test {
	void print();
}

// Ex 2
interface Age {
	int age = 26;

	void getAge();
}

class WithoutInner implements Age {

	@Override
	public void getAge() {
		System.out.println("From Outer class Age : " + age);

	}
}
