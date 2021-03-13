/**
  Ex08Overloading.java
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

public class Ex08Overloading {
	public static void main(String[] args) {
		Ex08Overloading1 t = new Ex08Overloading1();
		t.print(2); // print int
		t.print(2.2);// print double
		t.print(2.2f);// print float

		System.out.println("----- overloading2 ------");
		Ex08Overloading2 t2 = new Ex08Overloading2();
		t2.print(2); // print float as it is int and not double(when we pass 2.0 then it will print
						// double)
		t2.print((short) 2); // print float
		t2.print('c'); // print float
		t2.print("str"); // print object
		t2.print(2.2); // print double
		t2.print(2.2f); // print float

		System.out.println("----- overloading3 ------");
		Ex08Overloading3 t3 = new Ex08Overloading3();
		// t3.print(2); //int can't be demoted hence it will generate compiler issue.
	}

	public static void main() {
		System.out.println("main()");
	}

}

class Ex08Overloading1 {

	public void print(int n) {
		System.out.println("int");
	}

	public void print(double n) {
		System.out.println("double");
	}

	public void print(float n) {
		System.out.println("float");
	}

	public void print(Object n) {
		System.out.println("object");
	}
}

class Ex08Overloading2 {
	public void print(double n) {
		System.out.println("double");
	}

	public void print(float n) {
		System.out.println("float");
	}

	public void print(Object n) {
		System.out.println("object");
	}
}

class Ex08Overloading3 {

	public void print(short n) {
		System.out.println("double");
	}

	public void print(byte n) {
		System.out.println("double");
	}
}