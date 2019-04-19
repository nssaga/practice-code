/**
  Ex1SingleInheritance.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 03-Mar-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package beginner.oops.e3inheritance.single;

public class Ex1SingleInheritance {
	public static void main(String[] args) {
		B b = new B();
		b.add(10, 5);
		// We can directly access super class method(public and protected not private
		// but default if it is in same package)
		b.substract(10, 5);
	}
}

class A {
	protected int a; // protected fields are accessible to its child or in same package
	protected int b; //
	private int c;

	public void add(int a, int b) {
		this.a = a;
		this.b = b;
		c = a + b;
		System.out.printf("a + b = %d", c);
	}
}

/**
 * Variables are inheritance from class A
 */
class B extends A {

	private int c;

	public void substract(int a, int b) {
		this.a = a;
		this.b = b;
		c = a - b;
		System.out.printf("\nSubstract from class B : %d", c);
	}
}