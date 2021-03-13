/**
  Ex1While.java
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
package nssaga.beginner.e05control.e42dowhile;

public class Ex1While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// print number between 1 to 10 using while
		int n = 1;
		while (n <= 10) {
			System.out.print(n + " ");
			n++;
		}

		System.out.println();
		// print number between 1 to 10 using do-while
		int b = 1;
		do {
			System.out.print(b + " ");
			b++;
		} while (b <= 10);

	}

}
