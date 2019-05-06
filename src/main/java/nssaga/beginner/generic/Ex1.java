/**
  Ex1.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 06-Oct-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.generic;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		String[] names = new String[100];
		names[0] = "nawal";
		names[1] = "sah";
		// names[2] = new Integer(10);
		// incompatible data type, it will throw error at compile time and the array
		// make it
		// type safe.
		
		System.out.println(names.length);

		List list = new ArrayList<>();
		list.add("nawal");
		list.add("sah");
		list.add(new Integer(12));
		System.out.println((String) list.get(2)); // it will throw error at runtime not CT because value is number but
													// we are casting it string, hence we can say collection doesn't
													// provide type safety
	}
}
