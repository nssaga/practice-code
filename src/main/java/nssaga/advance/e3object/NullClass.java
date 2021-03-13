/**
  NullClass.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 27-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.advance.e3object;

public class NullClass {
	public static void main(String[] args) {
		Foo f = null;
		f.print(); // runs and print without error, static method requires only class reference
		// The static method print() from the type Foo accessed in a static way
	}

}

class Foo {
	public static void print() {
		System.out.println("foo");
	}
}