/**
  UserEnumEx.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 25-Aug-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.enums;

public class Ex01UserEnum {

	public static void main(String[] args) {
		System.out.println("Value : "+Ex01User.ADMIN.getValue());
		System.out.println("Name : "+Ex01User.ADMIN.getName((byte)0));
		System.out.println("Value by name : "+Ex01User.ADMIN.getValue("Admin"));
		System.out.println("Name by value : "+Ex01User.ADMIN.getEnum((byte)0).name());
	}
}
