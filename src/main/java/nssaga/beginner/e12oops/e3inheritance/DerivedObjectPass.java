/**
  DerivedObjectPass.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 27-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e12oops.e3inheritance;

public class DerivedObjectPass {

	public static void main(String[] args) {
		Base b1 = new Base();
		Base b2 = new Derived();
		Derived d1 = new Derived();

		foo(b1);
		foo(b2);
		foo(d1); // derived class is inherited from super class Base
	}

	public static void foo(Base b) {
		b.print();
	}
}

class Base {
	public void print() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void print() {
		System.out.println("Derived");
	}
}