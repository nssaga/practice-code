/**
  Ex02VariableLocal.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 27-May-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e01variable;

/**
 * if there is a local variable in a method with same name as instance variable,
 * then the local variable hides the instance variable. If we want to reflect
 * the change made over to the instance variable, this can be achieved with the
 * help of this reference.
 */
public class Ex02VariableLocal {

	// Instance variable or member variable
	private int value = 10;

	public static void main(String[] args) {
		// This local variable hides instance variable
		int value = 40;

		// System.out.println("Value of Instance variable :" + this.value); // Cannot
		// use this in a static context
		System.out.println("Value of Local variable :" + value);

		Ex02VariableLocal e = new Ex02VariableLocal();
		System.out.println("Value of Local variable :" + e.value);
	}

	void method() {
		// This local variable hides instance variable
		int value = 40;

		System.out.println("Value of Instance variable :" + this.value);
		System.out.println("Value of Local variable :" + value);
	}
}
