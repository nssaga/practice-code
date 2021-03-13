/**
  ArithmeticEx.java
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
package nssaga.beginner.e03operator.arithmetic;

//+,-,*,%
public class ArithmeticEx {

	// right hand
	// byte -> short -> int -> long -> float -> double
	// char -> int -> long -> float -> double

	// byte + byte = int
	// byte + short = int
	// short + short = int
	// shprt + int = int
	// byte + int = int
	// int + long = long
	// long + long = long
	// long + double = double
	// float + long = float
	// float + double = double

	public static void main(String[] args) {
		System.out.println();
		// In intgeral arithmetic (byte, short, int , long ) there is no way to
		// represent infinity hence if infinity is a result, then java will throw
		// "Arithmetic exception" but in floating point arithmetic (float, double),
		// there is a way to represent infinity

		// Case 1
		// int x = 10/0; //arithmetic exception
		double y = 0 / 0.0; // get infinity "NaN"
		System.out.println(y);

		// Case 2
		// int z = 0 / 0;
		// System.out.println(z);

		// Case 3
		double a = 0.0 / 0;
		System.out.println(a);

		// infinity results
		// 0.0/0 - infinity (result is double) NaN - Not a Number
		// 0/0.0 - infinity (result is double) NaN
		// 0/0 - Arithmetic exception
		// 0.0/0.0 - infinity (result is double) NaN - Not a Number

	}

}
