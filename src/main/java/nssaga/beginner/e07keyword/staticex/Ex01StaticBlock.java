/**
  Ex01StaticBlock.java
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
package nssaga.beginner.e07keyword.staticex;

/**
 * static block (also called static clause) can be used for static
 * initializations of a class. The code inside static block is executed only
 * once: the first time we make an object of that class or the first time we
 * access a static member of that class (even if we never make an object of that
 * class).
 * 
 * this keyword cannot be used in static block in java.
 * 
 * 
 * static blocks are executed before constructors.
 * 
 * Sequence of execution of block : 1. Static block, 2. Initializer block 3.
 * Constructor block
 * 
 * Static and non-static variables (instance variables) can be accessed inside
 * instance block in java.
 * 
 */
public class Ex01StaticBlock {
	public static void main(String args[]) {

		// Although we don't have an object of Test, static block is
		// called because i is being accessed in following statement.
		System.out.println(Test.i); // once initialize cann't be called again

		Test t = new Test();
		Test t1 = new Test();

	}
}

class Test {
	static int i;
	int j;

	// 1. start of static block
	static {
		i = 10;
		System.out.println("static block called ");
	}
	// end of static block

	// 2. Initializer block is Called every time when object is created
	{
		System.out.println("Initializer block");
	}

	// 3.
	Test() {
		System.out.println("Constructor called");
	}

}