/**
  Exception06.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 03-Jun-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e10exception;

/**
 * Java program to illustrate finally in Case where exceptions occur and match
 * in the program
 */
public class ExceptionEx06 {
	public static void main(String[] args) {
		int k = 66;
		try {
			System.out.println("In try block");
			int z = k / 0;
			// Carefully see flow dosen't come here
			System.out.println("Flow dosen't came here");
		}

		catch (ArithmeticException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally {
			System.out.println("Executes whether exception occurs or not");
		}
	}
}
