/**
  ExStringConcat.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 04-Aug-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e03operator.e32stringConcat;

public class ExStringConcat {
	// The only overloaded operator in java is plus (+) operator sometimes it acts
	// as arithmetic addition operator and sometime it acts as string concatenation
	// operator

	public static void main(String[] args) {
		String a = "Nawal";
		int b = 10, c = 20;

		// case 1
		System.out.println(a + b + c); // Nawal1020
		System.out.println(a + (b + c)); // Nawal30
		System.out.println(b + c + a); // 30Nawal

		// If preceding literal is string then plus operator acts as concatenation
		// operator
		// if preceding literals are number type then plus acts arithmetic addition
		// operator

		// case 2
		// a = b+c; // incompatible type as 'a' is string and b,c is int
		b = c + b; // both are int
		a = a + b + c; // valid as 'a' is string and here preceding literal is string hence the plus
						// operator acts as concatenation operator
		
		
	}
}
