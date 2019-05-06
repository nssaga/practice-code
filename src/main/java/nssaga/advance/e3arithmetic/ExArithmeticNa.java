/**
  ExArithmeticNa.java
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
package nssaga.advance.e3arithmetic;

public class ExArithmeticNa {
	public static void main(String[] args) {

		// NaN represent

		System.out.println(10 < Float.NaN);
		System.out.println(10 <= Float.NaN);
		System.out.println(10 > Float.NaN);
		System.out.println(10 >= Float.NaN);
		System.out.println(10 == Float.NaN);
		System.out.println(Float.NaN < Float.NaN);
		System.out.println(Float.NaN < Float.NaN);
		System.out.println(10 != Float.NaN);
		System.out.println(Float.NaN == Float.NaN);

		// ArithmeticException is Runtime exception and it is only possible in integral
		// arithmetic but not in floating and it only possible in divisible and modulo
		// operator
		
		

	}
}
