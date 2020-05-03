/**
  Armstrong.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 05-Aug-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e05control.e43forloop;

/**
 * A positive number is called Armstrong number if it is equal to the sum of
 * cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
 * 
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 */
public class Armstrong {
	public static void main(String[] args) {
		int c = 0, a, temp;
		int n = 153;// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
	}
}
