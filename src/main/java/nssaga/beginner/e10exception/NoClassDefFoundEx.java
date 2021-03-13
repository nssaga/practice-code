/**
  ExNoClassDefFound.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 28-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e10exception;

/**
 * NoClassDefFoundError in Java occurs when we attempt to load a java class
 * which is found during the compile time but not present during runtime.
 */
public class NoClassDefFoundEx {
	public static void main(String[] args) {
		FooException1 f1 = new FooException1();
		f1.print();
	}
}

// Remove the .class file after compilation
class FooException1 {

	public void print() {
		System.out.println("foo");
	}
}
