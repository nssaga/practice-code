/**
  Ex2OddEven.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 29-Jul-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e05control.e41ifelse;

public class Ex2OddEven {
	public static void main(String[] args) {
		oddeven1(5);
		oddeven2(50);
	}

	// case 1
	public static void oddeven1(int n) {
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	//case 2
	public static void oddeven2(int n) {
		if ((n & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
