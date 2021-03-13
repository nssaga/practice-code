/**
  Ex33.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 04-Aug-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e03operator.unary;

/**
 * inc/decrement is only applicable for variable not for constant , if we will
 * try for constant variable, it will throw compile time error "Unresolved
 * compilation problem: Invalid argument to operation ++/-- or unexpected type"
 */
public class Ex33 {
	public static void main(String[] args) {

		// case 1
		// int x =++10; // declaring and performing operation at same time.
		// System.out.println(x);

		// case 2
		// int y = 10;
		// int z = ++(++y); // Unresolved compilation problem: Invalid argument to
		// operation ++/-- or unexpected type

		// case 3
		// final int x = 10;
		// ++x; //We cann't apply inc/dec operator for final variable

		// case 4
		char ch = 'a';
		ch++;
		System.out.println(ch); // it will increase the ascii value

		// case 5
		double dou = 10.4;
		dou++;
		System.out.println("Double  " + dou);

		// case 6
		boolean b = true;
		// b++;//inc/dec cannot be apply on boolean

		// case 7
		// Difference between f = f+1 and f++
		byte f = 10;
		byte g = 10;
		// byte h = f + g; // By default arithmetic operation result is integer and if
		// it is higher data type then it type casted to higher data type, it must
		// be casted else it will throw "possible loss of precision"

		// f=f+1; // it must be casted because arithmetic operation result to integer
		f++; // in this case inc/dec does internal type casting

	}
}
