/**
  Ex2OverloadedCT.java
 ***********************************************************************************************************************
 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	    Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 11-May-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e12oops.e4polymorphism;

/**
 * parameter in polymorphism
 * 
 * Overloaded will always look for the matched data type but when not find the
 * matched data type then it looks for the widen(upper) data type
 * 
 * For example: if the argument is long but method has double and another method
 * has int parameter then it will call the double overloaded method
 */
public class Ex2OverloadedCT {
	public static void main(String[] args) {
		String str = new String();

		Poly1.m1(str);

		Poly1.m1(12);

		Poly1.m1(new Object());

		Poly1.m1((byte) 1); // It will call int overloaded method

		Poly1.m1(10L); // it will call the object overloaded method

		Poly1.m1(0.0f); // it will call the object overloaded method

		Poly1.m1(0.0);

		Poly1.m2(0.0f); // it will call the double overloaded method
		// Poly1.m2("Nawal");

		// Poly1.m3(0.0f); // It will throw compilation exception no widen overloaed
		// method found

		Poly1.m4(12);
	}
}

class Poly1 {
	public static void m1(String str) {
		System.out.println("Poly1 : M1 String");
	}

	public static void m1(Object obj) {
		System.out.println("Poly1 : M1 Object");
	}

	public static void m1(int obj) {
		System.out.println("Poly1 : M1 int");
	}

	// Second : When two overloaded method double and int but float value is passing
	// then it will double overloaded method and if we pass string then it will
	// throw CT exception
	public static void m2(double obj) {
		System.out.println("Poly1 : M2 double");
	}

	public static void m2(int obj) {
		System.out.println("Poly1 : M2 int");
	}

	// Third : When method has int parameter but sending float arguement then it
	// will throw CT exception
	public static void m3(int obj) {
		System.out.println("Poly1 : M3 int");
	}

	// Fourth: When two overloaded method i.e String and object and sending int
	// argument, it will call object overloaded method
	public static void m4(String obj) {
		System.out.println("Poly1 : M3 int");
	}

	public static void m4(Object obj) {
		System.out.println("Poly1 : M4 object");
	}

}