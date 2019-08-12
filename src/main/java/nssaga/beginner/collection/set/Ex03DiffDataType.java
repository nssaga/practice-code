/**
  Ex03DiffDataType.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 08-May-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex03DiffDataType {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(new Long(10));
		s.add(new Integer(10));
		// Integer and Long are two different data types and different objects. So they
		// will be treated as unique elements and not overridden.
		for (Object object : s) {
			System.out.println("test - " + object);
		}
	}
}
