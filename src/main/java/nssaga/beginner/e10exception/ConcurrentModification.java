/**
  ConcurrentModification.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 08-Jan-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e10exception;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModification {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Abc");
		list.add("Dbc");

		for (String str : list) {
			System.out.println(str);
			list.remove("Abc"); // Won't throw concurrent modification exception because the size is decreased
								// to 1 and the loop stopped
		}

		System.out.println("-----");

		List<String> list1 = new ArrayList<>();
		list1.add("Abc");
		list1.add("Dbc");
		list1.add("Ebc");
		list1.add("Fbc");

		for (String str : list1) {
			System.out.println(str);
			list1.remove("Abc"); // throw concurrent modification exception as it will iterated over and find modified
		}
	}
}
