/**
  Exception05.java
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
 * Java program to illustrate finally in Case where exceptions occur and do not
 * match any case in the program
 */

public class ExceptionEx05 {
	public static void main(String[] args) {
		int k = 15;
		try {
			System.out.println("In try block");
			int z = k / 0;
		}

		catch (NullPointerException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally {
			System.out.println("Executes whether exception occurs or not");
		}
	}
}
