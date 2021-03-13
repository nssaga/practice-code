/**
  Ex08Overriding.java
 ***********************************************************************************************************************
 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	    Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 02-Jan-2021		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e12oops.e3inheritance;

public class Ex08Overriding {

	public static void main(String[] args) {
		Ex08Overriding2 t2 = new Ex08Overriding2();
		t2.print1();
	}
}

class Ex08Overriding1 {

	public void print() {
		System.out.println("public method");
	}

	private void print1() {
		System.out.println("Ex08Overriding1.print1()");
	}
}

class Ex08Overriding2 extends Ex08Overriding1 {

	/*
	 * @Override // Cannot reduce the visibility of the inherited method from
	 * Ex08Overriding1 private void print() {
	 * System.out.println("overriden public"); }
	 */

	// @Override if we keep override then the super private method is not visible
	// and the compiler will throw exception but whed override is removed then it
	// won't check super
	public void print1() {
		System.out.println("Ex08Overriding2.print1()");
	}
}