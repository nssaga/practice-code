/**
  Ex2Inc.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 02-Aug-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e03operator.unary;

/**
 * Unary Operator
 * 
 * post inc(i++) first assign and then increment
 * 
 * pre inc(++i) first increment and then increment
 * 
 */
public class Ex31Inc {
	public static void main(String[] args) {
		int x = 90;

		// post
		System.out.println("x = " + x++);

		// pre
		System.out.println("x = " + ++x);
	}
}
