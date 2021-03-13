/**
  Ex1Bitwise.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 06-Aug-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e03operator.bitwise;

public class Ex1Bitwise {
	public static void main(String[] args) {
		System.out.println(4 & 5); // 4 -> 0100 & 0101
		System.out.println(4 | 5); // 4 -> 0100 | 0101
		System.out.println(4 ^ 5); // 4 -> 0100 ^ 0101
		
		//System.out.println(~true); //(Negation)complement operator not applied on boolean
		System.out.println(~4); //-4
	}
}
