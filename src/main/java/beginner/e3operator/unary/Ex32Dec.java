/**
  Ex32Dec.java
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
package beginner.e3operator.unary;

/**
 * Unary Operator
 * 
 * post dec(i++) first assign and then decrement
 * 
 * pre dec(++i) first increment and then decrement
 */
public class Ex32Dec {
	public static void main(String[] args) {
		int x = 90;

		// post
		System.out.println("x = " + x--);

		// pre
		System.out.println("x = " + --x);
	}
}
