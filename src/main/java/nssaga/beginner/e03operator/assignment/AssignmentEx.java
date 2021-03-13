/**
  AssignmentEx.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 12-Aug-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e03operator.assignment;

public class AssignmentEx {
	public static void main(String[] args) {
		// Simple Assignment Operator
		int x = 10;

		// Chained
		int a = 0, b = 0, c = 0;
		int y = a = b = c = 20;
		System.out.println(y);
		//int g = h = j = 10; // Can't declare and perform operation directly

		// Compound
		// int z+=10; //Can't declare and compute in a single line
		int z = 0;
		z += 10;

		a += b -= c *= z;
		System.out.println(a);

	}
}
